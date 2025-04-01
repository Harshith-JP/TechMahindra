import 'package:flutter/material.dart';
import '../services/firebase_service.dart';
import '../models/plant.dart';
import 'plant_detail_screen.dart';
import 'add_plant_screen.dart';
import 'package:easy_localization/easy_localization.dart';
import '../widgets/translation_button.dart';

class HomeScreen extends StatelessWidget {
  HomeScreen({super.key});

  final FirebaseService _firebaseService = FirebaseService();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('appName'.tr()),
        actions: const [TranslationButton()], // Corrected line
      ),
      body: StreamBuilder<List<Plant>>(
        stream: _firebaseService.getPlants(),
        builder: (context, snapshot) {
          if (snapshot.hasError) {
            return Center(child: Text('Error: ${snapshot.error}'));
          }

          if (snapshot.connectionState == ConnectionState.waiting) {
            return const Center(child: CircularProgressIndicator());
          }

          final plants = snapshot.data ?? [];

          return ListView.builder(
            itemCount: plants.length,
            itemBuilder: (context, index) {
              final plant = plants[index];
              return ListTile(
                title: Text(plant.name),
                subtitle: Text(plant.species),
                leading: plant.imageUrl.isNotEmpty
                    ? Image.network(
                        plant.imageUrl,
                        width: 50,
                        height: 50,
                        errorBuilder: (context, error, stackTrace) {
                          return const Icon(Icons.image_not_supported);
                        },
                      )
                    : const Icon(Icons.grass),
                onTap: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(builder: (context) => PlantDetailScreen(plant: plant)),
                  );
                },
              );
            },
          );
        },
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          Navigator.push(
            context,
            MaterialPageRoute(builder: (context) => const AddPlantScreen()),
          );
        },
        child: const Icon(Icons.add),
      ),
    );
  }
}
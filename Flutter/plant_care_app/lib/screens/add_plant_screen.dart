import 'package:flutter/material.dart';
import '../services/firebase_service.dart';
import '../models/plant.dart';
import 'package:easy_localization/easy_localization.dart';

class AddPlantScreen extends StatefulWidget {
  const AddPlantScreen({super.key});

  @override
  AddPlantScreenState createState() => AddPlantScreenState();
}

class AddPlantScreenState extends State<AddPlantScreen> {
  final _formKey = GlobalKey<FormState>();
  final _nameController = TextEditingController();
  final _speciesController = TextEditingController();
  final _careInstructionsController = TextEditingController();
  final FirebaseService _firebaseService = FirebaseService();
  final _imageUrlController = TextEditingController();

  Future<void> _addPlant() async {
    if (_formKey.currentState!.validate()) {
      final plant = Plant(
        id: '',
        name: _nameController.text,
        species: _speciesController.text,
        careInstructions: _careInstructionsController.text,
        imageUrl: _imageUrlController.text,
      );

      try {
        await _firebaseService.addPlant(plant);
        if (mounted) {
          Navigator.pop(context);
        }
      } catch (e) {
        if (mounted) {
          ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(content: Text('Error adding plant: $e')),
          );
        }
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('addPlant'.tr())),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Form(
          key: _formKey,
          child: Column(
            children: [
              TextFormField(
                decoration: InputDecoration(labelText: 'plantName'.tr()),
                controller: _nameController,
                validator: (value) => value == null || value.isEmpty ? 'plantName'.tr() : null,
              ),
              TextFormField(
                decoration: InputDecoration(labelText: 'plantSpecies'.tr()),
                controller: _speciesController,
                validator: (value) => value == null || value.isEmpty ? 'plantSpecies'.tr() : null,
              ),
              TextFormField(
                decoration: InputDecoration(labelText: 'careInstructions'.tr()),
                controller: _careInstructionsController,
              ),
              TextFormField(
                decoration: InputDecoration(labelText: 'imageUrl'.tr()),
                controller: _imageUrlController,
                validator: (value) {
                  if (value != null && value.isNotEmpty) {
                    if (!Uri.parse(value).isAbsolute) {
                      return 'Please enter a valid URL';
                    }
                  }
                  return null;
                },
              ),
              ElevatedButton(
                onPressed: _addPlant,
                child: Text('save'.tr()),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
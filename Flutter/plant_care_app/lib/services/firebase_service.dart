import 'package:cloud_firestore/cloud_firestore.dart';
import '../models/plant.dart';

class FirebaseService {
  final FirebaseFirestore _firestore = FirebaseFirestore.instance;

  Future<void> addPlant(Plant plant) async {
    await _firestore.collection('plants').add(plant.toMap());
  }

  Stream<List<Plant>> getPlants() {
    return _firestore.collection('plants').snapshots().map((snapshot) {
      return snapshot.docs.map((doc) => Plant.fromMap(doc.data(), doc.id)).toList();
    });
  }

  Future<void> updatePlant(Plant plant) async {
    await _firestore.collection('plants').doc(plant.id).update(plant.toMap());
  }

  Future<void> deletePlant(String plantId) async {
    await _firestore.collection('plants').doc(plantId).delete();
  }
}
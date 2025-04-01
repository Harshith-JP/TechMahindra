class Plant {
  final String id;
  final String name;
  final String species;
  final String careInstructions;
  final String imageUrl;

  Plant({
    required this.id,
    required this.name,
    required this.species,
    required this.careInstructions,
    this.imageUrl = '',
  });

  Map<String, dynamic> toMap() {
    return {
      'name': name,
      'species': species,
      'careInstructions': careInstructions,
      'imageUrl': imageUrl,
    };
  }

  factory Plant.fromMap(Map<String, dynamic> map, String id) {
    return Plant(
      id: id,
      name: map['name'] ?? '',
      species: map['species'] ?? '',
      careInstructions: map['careInstructions'] ?? '',
      imageUrl: map['imageUrl'] ?? '',
    );
  }
}
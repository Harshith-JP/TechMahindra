let actor = {
  name: "Leonardo DiCaprio",
  age: 50,
  profession: "Actor",
  introduce: function() {
    console.log("Name: " + this.name);
    console.log("Age: " + this.age);
    console.log("Profession: " + this.profession);
  }
};

console.log(actor.name);
console.log(actor.age);
console.log(actor.profession);

actor.introduce();

actor.address = {
  houseNumber: "221B",
  street: "Beverly Hills",
  city: "Los Angeles",
  showCity: function() {
    console.log("City: " + this.city);
  },
  showStreet: function() {
    console.log("Street: " + this.street);
  }
};

actor.changeProfession = function(newProfession) {
  this.profession = newProfession;
  console.log(`Profession changed to: ${this.profession}`);
};

console.log(actor.address.houseNumber);
actor.changeProfession("Producer");
actor.address.showCity();
actor.address.showStreet();

delete actor.profession;
delete actor.changeProfession;

console.log(actor);
actor.introduce();
actor.address.showCity();

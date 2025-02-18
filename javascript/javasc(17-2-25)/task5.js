const student = {
  id: 1,
  name: 'John Doe',
  department: 'Computer Science',
  college: 'ABC University',
  email: 'johndoe@example.com',
  address: {
    doorNo: '123',
    street: 'Main St',
    area: 'Downtown',
    pincode: '123456'
  },
  showAllDetails: function() {
    console.log(`ID: ${this.id}`);
    console.log(`Name: ${this.name}`);
    console.log(`Department: ${this.department}`);
    console.log(`College: ${this.college}`);
    console.log(`Email: ${this.email}`);
  },
  showIdNameEmail: function() {
    console.log(`ID: ${this.id}`);
    console.log(`Name: ${this.name}`);
    console.log(`Email: ${this.email}`);
  },
  showDetailsWithAddress: function() {
    console.log(`ID: ${this.id}`);
    console.log(`Name: ${this.name}`);
    console.log(`Department: ${this.department}`);
    console.log(`College: ${this.college}`);
    console.log(`Email: ${this.email}`);
    console.log(`Address: ${this.address.doorNo}, ${this.address.street}, ${this.address.area}, ${this.address.pincode}`);
  }
};

student.showAllDetails();
student.showIdNameEmail();
student.showDetailsWithAddress();

delete student.email;
delete student.showIdNameEmail;

console.log(student);

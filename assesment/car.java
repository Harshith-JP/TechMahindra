class Car {
    private String make, model;
    private int year;
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void startEngine() {
        System.out.println("The car engine starts.");
    }
}

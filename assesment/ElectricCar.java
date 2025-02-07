class ElectricCar extends Car {
    private int batteryRange;
    
    public ElectricCar(String make, String model, int year, int batteryRange) {
        super(make, model, year);
        this.batteryRange = batteryRange;
    }
    
    public void chargeBattery() {
        System.out.println("Charging battery...");
    }
}

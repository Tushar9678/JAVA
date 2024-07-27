package Inheritance;

public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String brand, String model, int year, double rentalPrice, int engineCapacity) {
        super(brand, model, year, rentalPrice);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}


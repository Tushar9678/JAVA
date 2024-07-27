package Inheritance;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String brand, String model, int year, double rentalPrice, int numberOfSeats) {
        super(brand, model, year, rentalPrice);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}

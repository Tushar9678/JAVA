package Inheritance;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double rentalPrice;

    public Vehicle(String brand, String model, int year, double rentalPrice) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Rental Price: " + rentalPrice);
    }
}


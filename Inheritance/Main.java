package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, 55.99, 5);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "MT-07", 2021, 45.99, 689);

        System.out.println("Car Information:");
        car.displayInfo();
        
        System.out.println("\nMotorcycle Information:");
        motorcycle.displayInfo();
    }
}


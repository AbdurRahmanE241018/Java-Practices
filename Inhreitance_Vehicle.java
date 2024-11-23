
package Inheritance;

public class Inhreitance_Vehicle {
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", 4);
        System.out.println("Car Details:");
        car.displayDetails();

        // Create Bike object
        Bike bike = new Bike("Yamaha", true);
        System.out.println("\nBike Details:");
        bike.displayDetails();
    
    }
}

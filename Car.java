
package Inheritance;

public class Car extends Vehicle {
    int doors;

    // Constructor
    Car(String brand, int doors) {
        super(brand); // Call the superclass constructor
        this.doors = doors;
    }

    // Method to display details
    void displayDetails() {
        displayBrand();
        System.out.println("Number of doors: " + doors);
    }
}

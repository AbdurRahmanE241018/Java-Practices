
package Inheritance;

public class Bike extends Vehicle {
  
     boolean hasCarrier;

    // Constructor
    Bike(String brand, boolean hasCarrier) {
        super(brand); // Call the superclass constructor
        this.hasCarrier = hasCarrier;
    }

    // Method to display details
    void displayDetails() {
        displayBrand();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

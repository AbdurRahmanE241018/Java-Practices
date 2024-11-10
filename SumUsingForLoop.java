package SomethingNew;

public class SumUsingForLoop {

    public static void main(String[] args) {
        
        int sum = 0;
        
        // Using a for loop to iterate from 1 to 10
        for(int i = 1; i <= 10; i++) {
            sum += i; // Adding each number to sum
        }
        
        // Print the sum only once after the loop completes
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }

}

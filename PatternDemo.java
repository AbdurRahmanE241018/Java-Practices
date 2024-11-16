package Beginnerjava;
import java.util.Scanner;
public class PatternDemo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter pattern line numbers: ");
        int n=input.nextInt();
       for (int row = 1; row <=n; row++) {
//     for (int row = n; row >=1; row--) {  //output:1234 123 12 1
            for (int col = 1; col <=row; col++) {
                System.out.print(""+col);
            }
            System.out.println("");
        }
    }
}
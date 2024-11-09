package BeginnerJava;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int number;
		System.out.print("Enter any number :");
		number=input.nextInt();
		
		if(number>0) {
			System.out.print("Given number is positive");	
		}
		else {
			System.out.print("Given number is negative");
			
	}

  }
}
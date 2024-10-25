package BeginnerJava;

import java.util.Scanner;

public class CalculateFahrenheit {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		double cels,farn;
		
		System.out.print("Enter the Celsius value:");
		cels=input.nextDouble();
		farn=1.8*cels+32;
		
		System.out.print("Fahrenheit value is:" + farn);		

	}

}

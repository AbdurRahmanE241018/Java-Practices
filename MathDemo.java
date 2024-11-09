package PrcticeJava;

import java.util.Scanner;

public class MathDemo {

	public static void main(String[] args) {
		
		/*
		int x=4;
		int y=3;
		System.out.println("Max value is:" + Math.max(x,y));
		System.out.print("Min value is:" + Math.min(x,y));
		double power=Math.pow(x, y);
		System.out.println("x to the power y is :" + power);

		*/
		
		Scanner input=new Scanner(System.in);
		int x,y;
		
		System.out.print("Enter two number:");
		x=input.nextInt();
		y=input.nextInt();
		
		System.out.println("Max value is:" + Math.max(x,y));
		System.out.println("Min value is:" + Math.min(x,y));
		
		double power=Math.pow(x, y);
		System.out.println("x to the power y is :" + power);
		
		int round=Math.round(8.5f);
		System.out.println("Round of 8.5 :" + round);
		
		System.out.println("Value of PI :" + Math.PI);
		
	}

}

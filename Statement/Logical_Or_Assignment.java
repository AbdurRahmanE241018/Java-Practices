package Statement.java;

import java.util.Scanner;

public class Logical_Or_Assignment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char ch;
	
		System.out.print("Do you love in java:");
		ch=input.next().charAt(0);
		
		if(ch=='y' || ch=='Y')
		{
			System.out.print("You are a java lover");
		}
		else
		{
			System.out.print("You are not a java lover");
		}
	}

}

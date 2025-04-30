package Statement.java;

import java.util.Scanner;

public class Logical_And_Assignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch;
		
		System.out.print("Have you completed your Hon's?:");
		ch=input.next().charAt(0);
		
		if(ch=='y' || ch=='Y')
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
		
	}

}

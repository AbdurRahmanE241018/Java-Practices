package Statement.java;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num;
		System.out.print("Enter any number:");
		num=input.nextInt();
		
		if(num %2 == 0)
		{
			System.out.print("Even Number");
		}
		else
		{
			System.out.print("Odd Number");
		}
	}

}

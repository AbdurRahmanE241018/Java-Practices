package Statement.java;

import java.util.Scanner;

public class If_statement {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num;
			System.out.print("Enter any number:");
		num=input.nextInt();
		if(num>0)
		{
			System.out.println("Positive");
		}
		
		if(num<0)
		{
			System.out.println("Negative");
		}

	}

}

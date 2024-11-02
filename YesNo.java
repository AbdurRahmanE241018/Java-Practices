package LogicalOperator;

import java.util.Scanner;

public class YesNo {

	public static void main(String[] args) {
		System.out.print("Do you love java?Enter your opinion:");
		char ch;
		
		Scanner input=new Scanner(System.in);
		ch=input.next().charAt(0);
		
		if(ch=='Y' || ch=='y')
		{
			System.out.print("You are a java lover");
		}
		else
		{
			System.out.print("You are not a java lover");
		}

	}

}

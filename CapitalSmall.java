package LogicalOperator;

import java.util.Scanner;

public class CapitalSmall {

	public static void main(String[] args) {
	
		Scanner input =new Scanner(System.in);
		char ch;
		
		System.out.print("Enter any letter:");
		ch=input.next().charAt(0);
		
		if(ch>='a' && ch<='z')  //Logical And operator
		{
			System.out.print("Small letter");
		}
		else if(ch>='A' && ch<='Z') 
		{
			System.out.print("Capital letter");
		}
		else
		{
			System.out.print("Not a letter");
		}
		

	}

}

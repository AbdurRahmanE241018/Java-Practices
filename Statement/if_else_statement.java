package Statement.java;

import java.util.Scanner;

public class if_else_statement {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		int budjet;
			System.out.print("Enter your budjet:");
		budjet=input.nextInt();
		if(budjet>1000)
		{
			System.out.println("Hurry!We will go to Cox's Bazar");
		}
		else
		{
			System.out.println("We will go to Patenga Sea Beach");
		}

	}

}

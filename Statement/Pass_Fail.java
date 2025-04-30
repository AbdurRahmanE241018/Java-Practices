package Statement.java;

import java.util.Scanner;

public class Pass_Fail {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num;
			System.out.print("Enter your number:");
		num=input.nextInt();
		
		if(num>=40)
		{
			System.out.println("You pass in the Exam");
		}
		else
		{
			System.out.println("Sorry!You fail in the Exam");
		}
	}

}

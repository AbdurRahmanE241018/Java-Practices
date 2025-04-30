package Statement.java;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		char ch;
		System.out.print("Enter any character:");
		ch=input.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.print("Vowel");
		}
		else 
		{
			System.out.print("Consonant");
		}
	}

}

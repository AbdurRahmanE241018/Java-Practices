package LogicalOperator;

import java.util.Scanner;

public class ConsonantVowel {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		char ch;
		
		System.out.print("Enter any letter:");
		ch=input.next().charAt(0);
//		Logical or operator
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {  
			System.out.print("Vowel");
		}else {
			System.out.print("Consonant");
		}

	}

}

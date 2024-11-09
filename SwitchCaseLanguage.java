package PrcticeJava;

import java.util.Scanner;

public class SwitchCaseLanguage {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num;
		System.out.print("Choose your option:");
		num=input.nextInt();
		switch (num) {
			case 0:
				System.out.print("Selected language is Bangla");
			break;
			case 1:
				System.out.print("Selected language Arabic");
				break;
			case 2:
				System.out.print("Selected language is Urdu");
				break;
			case 3:
				System.out.print("Selected language is English");
				break;
			default:
				System.out.print("Any other language");
		}
	}

}

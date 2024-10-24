package BeginnerJava;
import java.util.Scanner;
public class AssignmentOperator {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int x,y;
		
		System.out.print("Enter the value of X:");
		x=input.nextInt();
		
		System.out.print("Enter the value of Y:");
		y=input.nextInt();
		x+=y;
		System.out.print("Value of X is:"+x);
		
	/*
	int x=3;
	int y=2;
	
	x+=y;
	System.out.println("X="+x);
	x-=y;
	System.out.println("X="+x);
	x*=y;
	System.out.println("X="+x);
	x/=y;
	System.out.println("X="+x);
	x%=y;
	System.out.println("X="+x);
	*/
	}

}

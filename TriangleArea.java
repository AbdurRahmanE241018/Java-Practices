package BeginnerJava;
import java.util.Scanner;
public class TriangleArea {

	public static void main(String[] args) {
		
		int height,base,area;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the value for base:");
		base=input.nextInt();
		
		System.out.print("Enter the value for height:");
		height=input.nextInt();
		
		area=(base*height)/2;
		System.out.println("The value of triangle is:"+area);
		
		

	}

}

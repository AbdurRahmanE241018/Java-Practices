package BeginnerJava;
import java.util.Scanner;
public class CircleArea {

	public static void main(String[] args) {
		
		double area,radius;
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter the value of radius:");
		radius=input.nextDouble();
		
		area=3.1416*radius*radius;
		System.out.print("The value of radius is:"+area);


	}

}

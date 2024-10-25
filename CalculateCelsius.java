package BeginnerJava;
import java.util.Scanner;
public class CalculateCelsius {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		double cels,farn;
		
		System.out.print("Enter the Fahreheit value:");
		farn=input.nextDouble();
		
		cels=(.5556)*(farn-32);
		
		System.out.print("Celsius value is:" + cels);

	}

}

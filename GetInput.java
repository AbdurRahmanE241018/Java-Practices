package BeginnerJava;
import java.util.Scanner;
public class GetInput {

	public static void main(String[] args) {
		
		      Scanner input=new Scanner(System.in); 
		      String name;
		      
		      System.out.print("Enter your name:");
		      name=input.nextLine();
		      
		      System.out.print("Your name is:"+name);
		   
	}

}

package Final_Practice;

public class Unary_operator {

	public static void main(String[] args) {
		
		int x=10;
		int result;
		
		result = +x;
		System.out.println("Result="+result);
		
		result = -x;
		System.out.println("Result="+result);
		
		int y = 20;
		int z;
		
		z=++y; // Pre increment
		System.out.println("Z = "+z);
		
		z=y++;  // Post increment 
		System.out.println("Z = "+z);
		
		z=y;
		System.out.println("Z = "+z);
		

	}

}

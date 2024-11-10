package Inheritance;

public class Teacher extends Person{
		
	String qualification;
	String institution;
	void displayInformation2() {
		
		/*
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("ID :"+id);
		*/
		
		displayInformation1();
		
		System.out.println("Qualification :"+qualification);
		System.out.println("Institution :"+institution);
	}
	
	
		

}

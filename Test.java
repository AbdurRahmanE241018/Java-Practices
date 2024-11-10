package Inheritance;

public class Test {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		t1.name = " Jiabul Hoque";
		t1.age =  31;
		t1.id = 141078;
		t1.institution = "International Islamic University,Chittagong";
		t1.qualification = " MSc in CCE";
		t1.displayInformation2();
		System.out.println("\n");
		Teacher t2 = new Teacher();
		t2.name = " Saif Hannan";
		t2.age =  33;
		t2.id = 121055;
		t2.institution = "International Islamic University,Chittagong";
		t2.qualification = " MSc in Physics";
		t2.displayInformation2();
		
	}

}

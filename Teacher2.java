
package Method_Overriding;

public class Teacher2 extends Person2{

     //name,age,displayInformation
    
   @Override
   void displayInfomation2(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification);
    }

}

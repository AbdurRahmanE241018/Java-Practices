
package OOP;

public class Test_Teacher {
    public static void main(String[] args) {
        
       /* Teacher teacher1;  //object declare
        teacher1 = new Teacher(); //create*/
       
        Teacher teacher1= new Teacher();
        teacher1.name = "Jiabul Hoq";
        teacher1.gender = "Male";
        teacher1.id = 141582;
        teacher1.phone = 1842776586;
        
        System.out.println("Name:" + teacher1.name);
        System.out.println("Gender:" + teacher1.gender);
        System.out.println("ID:" + teacher1.id);
        System.out.println("Phone:" + teacher1.phone);
        
        /* Teacher teacher1;  //object declare
        teacher1 = new Teacher(); //create*/
        System.out.println("");
        
        Teacher teacher2= new Teacher();
        teacher2.name = "Amanul Islam";
        teacher2.gender = "Male";
        teacher2.id = 132485;
        teacher2.phone = 1842886886;
        
        System.out.println("Name:" + teacher2.name);
        System.out.println("Gender:" + teacher2.gender);
        System.out.println("ID:" + teacher2.id);
        System.out.println("Phone:" + teacher2.phone);
    }
}


package OOP.Method;

public class Test_Teacher {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        teacher1.name = "Jiabul Hoq";
        teacher1.gender = "Male";
        teacher1.id = 141582;
        teacher1.phone = 1842776586;
        teacher1.displayInformation();
        
        System.out.println("");
        
        Teacher teacher2= new Teacher();
        teacher2.name = "Amanul Islam";
        teacher2.gender = "Male";
        teacher2.id = 132485;
        teacher2.phone = 1842886886;
        teacher2.displayInformation();
    }
}

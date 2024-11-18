
package OOP.Parametrised_Method;

public class Test_Teacher {
    public static void main(String[] args) {
       
    Teacher teacher1=new Teacher();
    teacher1.setInformation("Jiabul Hoq","Male",1842776586);
    teacher1.displayInformation();
    
        Teacher teacher2= new Teacher();
        teacher2.name = "Amanul Islam";
        teacher2.gender = "Male";
        teacher2.id = 132485;
        teacher2.phone = 1842887584;
        teacher2.displayInformation();
    }
 
}

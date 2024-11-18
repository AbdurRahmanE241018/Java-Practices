
package OOP.Parametrised_Method;

public class Teacher {
    String name,gender;
    int phone,id;
    void setInformation(String n,String m,int ph){
        name = n;
        gender = m;
        phone = ph;
    }
    void displayInformation(){
        System.out.println("Name:" + name);
        System.out.println("Gender:" + gender);
        System.out.println("ID:" + id);
        System.out.println("Phone:" + phone);
        System.out.println("");
    }
}

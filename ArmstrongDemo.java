package Beginnerjava;
import java.util.Scanner;
public class ArmstrongDemo {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        int temp,r,num,sum=0;
          System.out.print("Enter any number:");
          num=input.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
    }
        if(num==sum){
               System.out.println("Armstromg number");
           }else{
               System.out.println("Not Armstrong number"); 
    }
    }      
}

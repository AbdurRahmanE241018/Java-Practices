package Beginnerjava;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int num,r,temp,sum=0;
         System.out.print("Enter any number:");
        num=input.nextInt();
        temp=num;
        while(temp!=0){
             r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
           if(num==sum){
               System.out.println("Palindrome number");
           }else{
               System.out.println("Not Palindrome number"); 
           } 
    }
    
}

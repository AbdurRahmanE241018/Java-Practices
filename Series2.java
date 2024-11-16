package Beginnerjava;
import java.util.Scanner;

public class Series2 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,i,result =1;
        System.out.print("Enter last number :");
        n=input.nextInt();
        for(i=1;i<=n;i=i+1){  //1*2*3*4*5*6*7*8*9*n
            result=result*i;
            System.out.print(i+"*");
        }
        System.out.println();
         System.out.println(result);

    }
    
}

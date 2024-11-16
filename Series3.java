package Series1;

import java.util.Scanner;

public class Series3 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        double n,i,result =1;
        System.out.print("Enter last number :");
        n=input.nextDouble();
        for(i=1.5;i<=n;i++){  //1.5*2.5*3.5*4.5*5.5....n*n
            result=result*i;
            System.out.print(i+"*");
        }
        System.out.println();
         System.out.println(result);

    }

    
}

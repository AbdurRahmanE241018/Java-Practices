package Beginnerjava;

import java.util.Scanner;
public class Multiplication {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
      /*  int num;
        System.out.print("Enter any number:");
        num=input.nextInt();
        for(int i=1;i<=10;i++)
        System.out.println(num+ " X " +i +"=" +num*i);
    }
}
*/
      int m,n;
       System.out.print("Enter initial number:");
        m=input.nextInt();
        System.out.print("Enter final number:");
        n=input.nextInt();
        for(int i=m;i<=n;i++)
            for(int j=1;j<=10;j++)
                System.out.println(i+ " X " +j +"=" +i*j);              
    }  
}

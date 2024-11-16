package Beginnerjava;

import java.util.Scanner;

public class SeriesSquare4 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,i,result=1;
        System.out.print("Enter last number:");
        n=input.nextInt();
        for(i=1;i<=n;i=i+1){  //1*1 + 2*2 + 3*3 + 4*4 + n*n
            result=result+i*i;
            System.out.print(i+"*"+i+ " ");
        }
        System.out.println();
         System.out.println(result);
          
}
}

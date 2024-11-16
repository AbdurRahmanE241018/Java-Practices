package array_demo;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] number=new int[5];
        int sum=0;
        
        System.out.print("Please enter 5 numbers:");
      /*  number[0]=input.nextInt();
        number[1]=input.nextInt();
        number[2]=input.nextInt();
        number[3]=input.nextInt();
        number[4]=input.nextInt(); */ // comment 1
        for (int i = 0; i < 5; i++) {
             number[i]=input.nextInt();
        } 
        for (int i = 0; i < 5; i++) {
            sum=sum+number[i];
        }
       /* sum=number[0]+number[1]+number[2]+number[3]+number[4];  */ //comment 1
        System.out.println("The sum is:"+sum);
        System.out.println("The average is:"+sum/5);
   }
}

package array_demo;
import java.util.Scanner;
public class MaximumMinimumarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] number=new int[5];
        int sum=0;
        
        System.out.print("Please enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
             number[i]=input.nextInt();
        } 
        for (int i = 0; i < 5; i++) {
            sum=sum+number[i];
        }
        int avg=sum/number.length;
        System.out.println("The sum is:"+sum);
        System.out.println("The average is:"+avg);
        int max=number[0];
        int min=number[0];
        for (int i = 1; i < 5; i++) {
            if(max<number[i]){
            max=number[i];    
        }
        if(min>number[i]){
            min=number[i]; 
        }
      }
        System.out.println("Maximum="+max);
        System.out.println("Minimum="+min);
   }
}

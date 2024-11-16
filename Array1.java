package array_demo;

public class Array1 {
    public static void main(String[] args) {
        int[] number;
        number=new int[5]; //or int[] number=new int[5];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
       // System.out.println(number[2]);//Calculate array value
    /*   int len=number.length;//for Calculate arrasy size
        System.out.println("Array size:"+len); */
    int sum=number[0] + number[1] + number[2] + number[3] + number[4];
    int len=number.length;
        System.out.println("Sum of Array="+sum);
        System.out.println("Array size="+len);
    }
}

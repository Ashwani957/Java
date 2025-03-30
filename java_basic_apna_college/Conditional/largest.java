import java.lang.*;
import java.util.Scanner; 

public class largest{
    public static void main (String args[])
    {
        System.out.println("largest of three number");
        Scanner sc = new Scanner (System.in );
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt(); 
        int num3=sc.nextInt(); 
            if (num1>num2 && num1>num3)
            {
                System.out.println("number  1 is largest "+num1);
            }
            else if (num2>num3)
            {
                System.out.println("number 2 is largest"+num2);
            }
            else {
                System.out.println("number 3 is largest"+" "+ num3);
            }

    }
}
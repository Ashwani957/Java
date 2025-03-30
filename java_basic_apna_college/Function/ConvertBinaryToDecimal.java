

import java.util.Scanner; 
public class ConvertBinaryToDecimal {
    public static void  decimalToBinary (int number )

    {

        int decimal = 0 ; 
        int pow=0 ; 
        int small = number;
            while (small>0)
            {
                // This will give us a lastDigit number
                int lastDigit = number%10; 
                decimal = decimal + (lastDigit *(int) Math.pow(2,pow));
                pow++; 
                // This Help us to smaller the number 
                small=small/10; 

            }
            System.out.println("Binary "+ number +"is"+" decimal "+ +decimal);

    }
    public static void main (String args[])
    {

        Scanner sc = new Scanner (System.in );
        int number = sc.nextInt(); 
        decimalToBinary(number);

    }
}

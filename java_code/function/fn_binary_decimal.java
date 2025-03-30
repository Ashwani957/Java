public class fn_binary_decimal{





// public static  void fn_binary_decimal(int bin_number)
// {
//     int bit=bin_number;
// int pow = 0 ; 
// int decimalNo =  0 ;


// while (bin_number>0)
// {
//     int lastDigit=bin_number%10;
//     decimalNo=decimalNo+(lastDigit*(int)Math.pow(2,pow));
//     pow ++;
//     bin_number=bin_number/10;
// }

// System.out.println("decimal of"  +bit  +"  "+decimalNo);
// }







public static void binary(int number)
{
    int numberbits= number; 
int decimal = 0 ; 
int power = 0 ;

while (number>0 )
{
    int lastDigit= number%10; //IT PORVIDES THE LAST DIGIT
    decimal=decimal+lastDigit*(int)Math.pow(2,power); 
    power++;
    number=number/10 ; 


}

System.out.print("binary"  +numberbits + "to decimal" +" "+decimal );


}











public static void main (String args[])
{
 binary(111);

}


}
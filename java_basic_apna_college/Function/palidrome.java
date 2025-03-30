public class palidrome{


public static void isPalidrome (int number) {

    int reverse = 0 ; 
    int remainder=0 ; 
    int number1 = number ; 
    while (number != 0) {
        remainder=number%10;  
        reverse=reverse*10+remainder;
        number=number/10; 

    }
    System.out.println("reverse is :"+reverse);
    System.out.println("number is :" +number1);
    if (reverse==number1)
    {
         System.out.println("Panidrome");
    }
   
}


    public static void main (String args[])
    {
        isPalidrome(121);
    }
}
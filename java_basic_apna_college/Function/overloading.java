public class overloading {

public static int multiplication (int number1 , int number2 , int number3)
{
    return number1 * number2 * number3; 
}


public static int multiplication (int number1 , int number2)
{
    return number1 * number2; 
}

public static float  multiplication (float number1,float number2){
    return number1*number2; 
}

    public static void main (String args[])
    {
     float result =multiplication(2,3,4);
     System.out.println(result);

     


    }
}

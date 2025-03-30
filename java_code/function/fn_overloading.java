public class fn_overloading {

    public static int sum (int a, int b)
{
    return a+b ; 
}
public static int sum (int a ,int b , int c )
{
    return a+b+c ; 

}

public static float  sum (float a  , float b )
{
    return a+b ;
}


public static  float sum (float a , float b , float c){
    return  a+b+c ; 
}

    public static void main (String args[])
    {

        float  num1 = 10.5f ; 
        float num2 = 2.5f;
 int result=(int)sum(num1,num2);


 System.out.println(result);
    }
}
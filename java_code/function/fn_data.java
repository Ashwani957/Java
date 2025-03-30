import java.util.*; 

public class fn_data{

public static float sumfloat (float a , float b )
{
    return a+b ; 
}

    public static void main (String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num1");
        float num1=sc.nextFloat();
        System.out.println("enter the value of num2");
        float num2 =sc.nextFloat();
        float result =sumfloat(num1,num2);
        System.out.println(result);
    }
}
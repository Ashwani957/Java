import java.util.*;

public class fn5{
public static int factorial(int number)
{
int fact=1 ; 
for (int i = 1; i<=number; i++)
{
    fact=fact*i; 
}
return fact ;
}
    public static void main (String args[])
    {
Scanner sc =new Scanner (System.in);
System.out.println("enter value");
int num=sc.nextInt();
int result=factorial(num);
System.out.println(result);

    }
}
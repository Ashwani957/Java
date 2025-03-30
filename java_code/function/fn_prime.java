import java.util.*;

public class fn_prime{

    public static int prime(int number)
    {

        // if (number==2 )
        // {
        //     return 1; 
        // }
        int prime=1;
        for (int i=2 ;i<=number-1;i++)
        {
            if (number%i==0)
            {
                prime=0 ; 
            }
           

        }
            return prime ;

    }
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int result = prime(n);
System.out.println("1::for prime , 0:: not prime");
System.out.print(result);


    }
}
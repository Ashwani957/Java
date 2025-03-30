 public class p_range{


public static boolean isprime(int number)
{
    boolean isprime=true ; 

    if (number==2)
    {
        return true;
    }
    for (int i=2 ; i<=number-1; i++)

    {        if (number%i==0)
        {
            isprime=false ;
            break ; 
        }
    }

    return isprime;
}




public static void primeinrange(int n )
{
    for (int i = 2 ;i<=n ; i++)
    {
        if (isprime(i)){
            //true ; 
            System.out.print(i+"  ");

        }
    }
    System.out.println();
}
public static void main(String args[])
{

   primeinrange(12);



}


 }
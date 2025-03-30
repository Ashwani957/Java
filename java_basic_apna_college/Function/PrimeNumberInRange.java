public class PrimeNumberInRange{

public static boolean isPrime(int number )
{
    for (int i = 2 ; i<number ; i++)
    {
        if (number%i ==0)
        {
            return false; 
        }
    }
    return true ; 
}


public static void primeInrange(int number )
{
    for (int i = 0 ; i<=number ; i++)
    {
        if (isPrime(i)==true)
        {
            System.out.println(i);
        }
    }
}

    public static void main (String args[])
    {
        primeInrange(100);
    }
}
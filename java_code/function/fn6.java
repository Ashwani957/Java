public class fn6{

public static int factorial (int num)
{
    int fact = 1 ; 
    for (int i =  1 ; i<=num ; i++)
    {
        fact=fact*i ; 
    }
    return fact ; 
}


public static int binomialcoffecient(int n , int r)
{
    // formula of binomailcoffiecent is === n!/n-r


    int fact_n = factorial(n);
    int fact_r=factorial(r);
    int factnmr=factorial(n-r);


    int bincoff=fact_n /(fact_r*factnmr);
    return bincoff;
}

    public static void  main (String args[])
    {
        int result = binomialcoffecient(5,2);
        System.out.print(result);
    }
}
import java.util.Scanner; 

public class BinomialCofficent {

public static int factorial(int number)
{
    int fact = 1; 
    for (int i = 1 ; i<=number;i++)
    {
        fact=fact*i; 
    }
    return fact  ;
}
    public static void main (String args[])
    {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n and r");
int n = sc.nextInt(); 
int r  =sc.nextInt(); 

int nfact = factorial(n);
int rfact = factorial(r);
int nfactMinusrfact= factorial(n-r);
double  result =(nfact)/(rfact*nfactMinusrfact);
System.out.println("The Binomial Cofficient is :"+result);
    }
}
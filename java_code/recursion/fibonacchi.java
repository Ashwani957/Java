import java.util.* ; 
public class fibonacchi{
    public static int fibo(int number)
    {
        if (number==0 )
        {
            return 0 ;
        }
        if (number==1)
        {
            return 1;
        }

        int fibnminusone=fibo(number-1);
        int fibnminustwo=fibo(number-2);
        int fib = fibnminusone+fibnminustwo;
        return fib ;

    }
    public static void main(String args[])
    {
Scanner sc = new Scanner (System.in);
int num = sc.nextInt ();
System.out.println (fibo(num));
    }
}
public class FibonacciSerires {
    public static void main (String[] args)
    {
        int fistnumber=0; 
        int secondnumber=1;
        int i ; 

        for (i=1; i<=10; i++)
        {
            System.out.println(fistnumber);
            int sum = fistnumber + secondnumber;
            System.out.println(sum);
            fistnumber = secondnumber;
            secondnumber = sum;
        }
    }
}

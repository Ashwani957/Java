public class optimized {
    public static int optimizedpower(int a , int n )
    {
        if (n==0 )
        {
                return 1; 
        }
//this will divide the value of n every time by 2
        int halfpowersq=optimizedpower(a,n/2)*optimizedpower(a,n/2);


        // n is odd number
        if(n%2!=0)
        {
            halfpowersq=a*halfpowersq;
        }
        return halfpowersq ; 
    }
    public static void main (String args[])
    {
int number = 2 ; 
int pow = 3 ; 
System.out.println (optimizedpower(2,3));
    }
}
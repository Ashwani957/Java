public class pairing{

    public static int pair (int n)
    {


        if (n==1|| n==2)
        {

            return n ; 
        }
        // single  when one choose another
         int fnm1=pair(n-1);
        //  pair  after one person get pair with another person 
        int fnm2= pair (n-2);
        // way of pairing
        int pairway= (n-1)*pair(n-2);
// int totalpairs=
int totalpairs=fnm1+fnm2; 
return totalpairs ; 


    }
    public static void main (String args[])

    {
 
 System.out.println(pair(4));
    }
}
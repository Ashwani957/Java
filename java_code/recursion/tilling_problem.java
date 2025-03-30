public class tilling_problem {
public static int tillingprbln(int n)
{
    // base 
    if (n==0|| n==1)
    {
        return 1; 
    }

// vertical prbln 
int fmn1 = tillingprbln(n-1);
// horizontal prblm
int fmn2 = tillingprbln(n-2);
int totways=fmn1+fmn2; 
return totways ; 


}
    public static void main (String args[])
    {
System.out.println (tillingprbln(4));
    }
}
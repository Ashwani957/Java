public class power{

    public static int powers (int number , int po)
    {
        if (po==0)
        {
            return 1 ; 
        }
        int xm1=powers(number,po-1);
        
        int xn=number*xm1;

        return xn  ; 

    }
    public static void main (String args[])
    {
int number = 3;
int pow = 2; 
System.out.println(powers(number,pow));
    }
}
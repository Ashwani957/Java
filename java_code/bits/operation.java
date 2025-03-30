public class operation {
    public static int getith_bits(int number, int i )
    {
        int bitmask=1<<i ; 

        if((number&bitmask)==0)
        {
            return 0 ; 
        }
        else {
            return 1; 
        }
    }

    public static int SetItBit(int number, int i )
    {
        int bitmask=1<<i ;
        return number|bitmask;
    }

    public static int ClearBit(int number , int i )
    {
        int bitmask= ~(1<<i); 
        return number & bitmask;

    }
    public static void main (String args[])
    {
System.out.println ("for getith_bits");
System.out.println(getith_bits(10,4));
System.out.println ("for setith_bits");
System.out.println (SetItBit(10,2));
System.out.println ("for clear bit");
System.out.println(ClearBit(11,2)) ;

    }
}
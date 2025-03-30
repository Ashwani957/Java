// To check something 

public class powe{

    public static boolean ispoweroftwo(int number )

    {

    // the bits sum of odd and even is always odd

    
        return (number & (number-1))==0;
    }
    public static void main (String args[])
    {
       System.out.println ( ispoweroftwo(15));
        
    }
}
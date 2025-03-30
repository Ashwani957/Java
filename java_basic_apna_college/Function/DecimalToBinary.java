public class DecimalToBinary {
    public static void decimalToBinary (int number )
    {
        int pow=0 ; 
        
        int binary = 0 ; 
        while (number>0)
        {
           int remainder =number%2 ; 
            binary= binary +(remainder* (int) Math.pow(10,pow)); 
            pow++ ; 
            number =number/2; 

        }
        System.out.println("Decimal to BInary"+number+"="+binary);
    }
    public static void main (String args[])
    {
decimalToBinary(7);
    }
}
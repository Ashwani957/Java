public class reverse_numbers_store{
    public static void main(String args[])
    {
    int reverse = 0 ; 
    int number= 23423;
    while (number>0)
    {
        int lastdigit=number%10 ; 
        reverse=(reverse*10)+lastdigit;
        number=number/10;
    }

    System.out.print(reverse);
    }
}
import java.util.*;

public class reverse_number{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int number=sc.nextInt();
        // int number= 12345;
        while (number>0)
        {
            int lastdigit=number%10 ;
            System.out.print(lastdigit);
            number=number/10;
        }

    }
}
import java.util.*;
public class sum_n_no{

    public static int sum (int number)
    {
        if (number ==1 )
        {
            return 1; 

        }

        int sum_natural= number + sum(number-1);
        return sum_natural ;
    }
    public static void main (String args[])
    {
Scanner sc = new Scanner (System.in);
int number = sc.nextInt();
System.out.println(sum(number));


    }
}
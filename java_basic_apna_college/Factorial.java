
import java.util.Scanner; 
public class Factorial {
    public static void main (String[] args)
    {
        int factorail=1; 
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();

        for (int i = 1; i<=num ; i++)
        {
            factorail=factorail*i;
        }
        System.out.println("The factorial of  of "+ num +"is" + " "+factorail);
        
    }
}

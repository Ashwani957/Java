import java.util.* ; 

public class factorial {

    public static int fact(int number)
{

    if (number ==1)
    {
        return 1 ; 
    }

    return number * fact(number-1);
}
    public static void main (String args[])
    {
Scanner sc= new Scanner(System.in); 

int number = sc.nextInt ();

System.out.println (fact (number));


    }

}
import java.util.Scanner; 

public class OddNumber {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int sum = 0 ; 
         
        for(int i=0 ; i<=num*2; i++)
        {
            if (i%2!=0)
            {
                System.out.println(i);
                sum+=i ; 
            }
        }
        System.out.println("The sum of odd numbers is " + sum);

    }
}

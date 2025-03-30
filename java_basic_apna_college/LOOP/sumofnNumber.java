import java.util.Scanner ;

public class sumofnNumber{
   public static void main (String args[]) 
   {
    Scanner sc =new Scanner (System.in );
    int i ; 
    int sum = 0 ; 
    float avg =0;

    for (i=0; i<10; i++)
    {
        int number=sc.nextInt(); //taking input from user

        sum+=number ;
         avg =sum/10;
        

    }
    System.out.println("Sum of 10 numbers is "+sum);
    System.out.println("Average of 10 numbers is " + avg);
   }
}

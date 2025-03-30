import java.util.Scanner;

public class  sumofnatural {

    public static void  main (String[] args)
    {
        System.out.println("Enter the number ");
        Scanner sc = new Scanner (System.in);
        int number=sc.nextInt(); 
    int i; 
    int sum =0 ; 
    for (i = 1 ; i<=number ; i++)
    {
        System.out.println("The first natural number is :"+ i);
        sum +=i ; 

    }
    System.out.println("The sum of first n natural number is :"+sum );
    }
   

}
    





import java.util.Scanner ; 

// public class PrimeNumber{
//     public static boolean isPrime(int number)
//     {
//         boolean isPrime=true; 
//         for (int i = 2 ; i<=number-1 ; i++)
//         {
//             if (number%i ==0 )
//             {
//                 isPrime=false; 
//                 break ; 
//             }
//         }
//         return isPrime ; 
//     }
//     public static void main(String args[])
//     {
//         System.out.println("Enter the number ");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt(); 
//         boolean  result = isPrime(number);
//        System.out.println(result );
//     }
// }


// Example 2 : Optimize way to solve any problem :::::


public class PrimeNumber {

    public static boolean isPrime (int number )
    {
        if (number==2)
        {
            return true; 
        }
        for(int i=2 ; i<=Math.sqrt(number); i++)
        {
            if (number%i==0)
            {
                return false ; 
            }

        }
        return true ; 
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int number =sc.nextInt();



      boolean result=isPrime(number);
 System.out.println(result);

    }
}
import java.util.*;
public class largestthree{
    public static void main( String args[])
    
    {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();

      if (number1>=number2&&number1>=number3)
      {
        System.out.println("number1 is greaer");
      }

      else if (number2>=number3)
      {
        System.out.println("number2 is greater");
      }
      else {
        System.out.println("number3 is greater");
      }

    }
}
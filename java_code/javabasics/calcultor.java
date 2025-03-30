import java.util.*;

public class calcultor{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number1");

        int number1=sc.nextInt();

        System.out.println("enter number2");

        int number2=sc.nextInt();
        System.out.println("enter operator");
        char operation =sc.next().charAt(0);
       switch(operation)
       {
        case '+':System.out.println(number1+number2);
        break ;     
        case '-':  System.out.println(number1-number2);
        break ; 
        case '*':System.out.println(number1*number2);
        break ; 
        case '/':System.out.println(number1/number2);
        break ; 
        case '%':
            System.out.println(number1%number2);
            break ;


            default : 
            System.out.println("unknown operation ");
       }
    }
}
import java.util.Scanner;
public class Case {
     public static void main (String args[])
     {
        Scanner sc=new Scanner(System.in );
        int number1=sc.nextInt(); 
        int number2 =sc.nextInt(); 
        int number3 =sc.nextInt(); 
        System.out.println("Enter the operation that you want to perform +,-,%");
        char operation=sc.next().charAt(0);
        switch(operation)
        {
            case '+'->System.out.println(number1+number2+number3);
            case '-'->System.out.println(number1-number2-number3);
            case '*' -> System.out.println(number1*number2*number3);

            default-> System.out.println("Invalid operation you perform ");
        }
        
        

     }
}

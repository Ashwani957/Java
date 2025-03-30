import java.util.Scanner ; 

public class average {

    public static float  average(int number1, int number2, int number3)
    {
       float average = 0 ; 

        average = (number1+number2+number3)/3; 
        return average ; 
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number");
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        int number3= sc.nextInt();

       float result=average(number1,number2,number3);
        System.out.println("The average is "+result);

    }
}

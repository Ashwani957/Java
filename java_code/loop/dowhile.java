
import java.util.*;
public class dowhile {
    public static void main(String args[])
    {
        // int number= 12; 
        // int counter = 0 ; 

        // do {
        //     System.out.println("Hello world ");
        //     counter++;

        // }
        // while (counter<=number);

    Scanner sc=new Scanner(System.in);

    do{
        System.out.println("enter your number");
        int number = sc.nextInt();
        if (number%10==0){
            break ; 
        }
        else {
            System.out.println("exit");
        }
        System.out.println(number);

    }
while(true);

    }
}
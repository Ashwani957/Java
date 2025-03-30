import java.util.*;

public class fn2{

    public static int printsum(int num1, int num2){

        int sum = num1+num2;
return sum ; 
    }



    public static void main(String args[])
    {
        
Scanner sc=new Scanner (System.in);
System.out.println("enter a ");
int a=sc.nextInt();
System.out.println("enter b ");
int b = sc.nextInt();
int sum =printsum(a,b);

System.out.println("sum is :"+sum);




    }
}
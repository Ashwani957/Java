public class fn3{

public static void swap(int num1, int num2)
{
    int temp=num1; 
      num1=num2; 
      num2=temp; 
    System.out.println("a is :::"+num1);
    System.out.println("a is :::"+num2);


}


    public static void main (String args[])
    {
int a = 12 ; 
int b = 23;  
swap(a,b );
System.out.println(a);
System.out.println(b);




    }
}
import java.util.*; 

public class Scan {
    public static void main (String args[]){
        // input 
       Scanner sc =new Scanner(System.in);
        String name=sc.nextLine(); 
        System.out.println(name);


        String Fullname=sc.nextLine(); 
        System.out.println(Fullname);
        System.out.println("enter your age");
        int age =sc.nextInt(); 
        System.out.println(age);
        System.out.println("number");
        long number=sc.nextLong(); 
        System.out.println(number);

        System.out.println("float");
        float f =sc.nextFloat(); 
        System.out.println(f);

        System.out.println("double");
        double d =sc.nextDouble(); 
        System.out.println(d);

        System.out.println("Long");
        long l =sc.nextLong(); 
        System.out.println(l);



 

    }
}

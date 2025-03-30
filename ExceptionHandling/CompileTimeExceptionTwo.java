

public class CompileTimeExceptionTwo {
    public static void main (String ...args)
    {
        // compile time excepiton 
        // it show a compile time excepiton 

        // FileInputStream file =new FileInputStream("d:/abc.txt");
        // Class.forName("com.mysql.jdbc.Driver");//unhandled excepiton classNotFoundException 



        // runtime excepiton does not catch by compiler at compile time 
        // example 1 : ArithmeticException
        // int a = 100 , b = 0 ,c; 
        // c = a/b; 
        // System.out.println("c");

        // example 2 :  Null Pointer Exception 

        String name = null ;  
        System.out.println(name.length()); //java.lang.NullPointerException:


        

    }
}

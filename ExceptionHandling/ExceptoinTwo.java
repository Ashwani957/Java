public class ExceptoinTwo {

    public static void main (String ...args)
    {
        int a = 10; 
        

        try {


            int c = a/0; // risky code 



            
        } 
        //we can  also write a exception  in the parathesis because excepiton in the parent of all the excepiton 
        
        // catch (Exception e) {
        //     e.printStackTrace();
        // }


        // different way to print the error 
        catch(ArithmeticException ae)

        {
            // stacktrace means error in which line 
            // ae.printStackTrace will print the all stack include description , name of error , stacktrace
                // ae.printStackTrace();
                // ae.toString(); // return the description of the stacktrace 
System.out.println("The error:"+ ae.getMessage());

        }
        // finally block will always executed it does not matter error occur or not 
finally{
    System.out.println("finally blocked is executed");
}
    }
}


// different way to print the exception 
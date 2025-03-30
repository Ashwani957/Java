

class Test {
    void run(){
        System.out.println("Test is running");
    }
}

class Homework extends Test {
    @Override
    // if we try to use checked exception like exception then i face an error 
    // void run() throws ArithmeticException { //unchecked exception 
    void run() throws Exception{ 
        // checked exception 

        System.out.println("Homework is running");
    }
}



public class PolymorphismExceptionahndling {
    

public static void main(String ...args)
{

    Test t=new Test(); 
    t.run(); 

}

}

// import java.lang.*
 ; 
class A extends  Thread {



// creation of thread 
public void  run ()

{
    // this print is responsible for child thread 


for (int i = 0 ;i<=5; i++)
{
    System.out.println("hello world");
}

}

}



class B {
    public static void main (String args[])
    {
        // creation of object of threads or class
        // here only main thread is available 

        A t = new A();
        // after the creation of object two threads is avoailable in this progamme 

        t.start();

for (int i = 0 ;i<=5; i++)
{
    System.out.println("hello world");
}



    }
}
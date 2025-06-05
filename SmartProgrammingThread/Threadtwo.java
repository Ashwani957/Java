//performing multiple task from single threads is not possible


//performing multiple task form multiple threads

class Threadone extends Thread{
    public void run(){

        System.out.println("Threadone is running ");
    }
}


class Threadtwos extends Thread{
    public void run(){

        System.out.println("Thread two is running");

    }
}

 public class Threadtwo{
    public static void main(String args[])

    {
//the execution of thread is not sequentially becuase it totally depend upon the jvm and thread scheduler

        Threadone th1=new Threadone();
        th1.start();
        Threadtwos th2=new Threadtwos();
         th2.start();

    }
 }
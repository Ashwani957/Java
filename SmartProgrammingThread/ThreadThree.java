
class Test extends Thread {
    public void run(){

//        if we do not provide the name of the thread then main thread will provide the name that is thread0

        System.out.println("The thread Name is : "+ Thread.currentThread().getName());

    }
}





public class ThreadThree {
    public static void main (String args[])
    {

//        Here we get the name of the thread
        System.out.println(Thread.currentThread().getName());
//        Here we set the name of the thread

          Thread.currentThread().setName("ashwani");
        System.out.println(Thread.currentThread().getName());

//        creation of thread in main

        Test t = new Test();
        t.start();




    }
}

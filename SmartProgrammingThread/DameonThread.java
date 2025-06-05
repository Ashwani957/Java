class Tests extends Thread {
    public void run(){
//        System.out.println("Dameon threads are created that are used to run in background ");

        if(currentThread().isDaemon()){
            System.out.println("Damenon Threads");
        }
        else {
            System.out.println("NOt a daemon thread");
        }
    }
}
public class DameonThread
{
    public static void main(String args[])

    {

System.out.println("Main Thread");
        Tests ts =new Tests();
        ts.setDaemon(true);
        ts.start();




    }
}

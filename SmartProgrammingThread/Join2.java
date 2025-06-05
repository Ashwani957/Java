
// In previous  we first execute the Thread O , then we execute the  main thread
// but in this example we can  execute the main thread first then execute the  Thread 0


public class Join2  extends Thread {

      static Thread mainThreadef;
    public void run() {

        try{
            mainThreadef.join();
           for (int i = 0 ; i<10; i++)
            {
                System.out.println("Thread0:"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

         mainThreadef =Thread.currentThread();

        Join2 j =new Join2();
        j.start();


        try{
            for(int i =0 ; i<10; i++)
            {
                System.out.println("mainThread:"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }




    }
}
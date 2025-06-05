//Interrupted thread are used to stop the execution of the thread  and this interuption is work only when we need to stop
// Interrupted will work only if sleep and wait() method is present otherwise it will not work

//if we do not write the sleep method  Then the workflow will be normal

public class Interupt extends Thread  {

    public void run() {

        try{
            for (int i =0 ; i<10 ; i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
         catch(Exception e )
         {
             System.out.println("Thread is Interrupted ");
         }

    }
    public static void main(String[] args) {



Interupt in=new Interupt();
in.start();
in.interrupt();

    }
}

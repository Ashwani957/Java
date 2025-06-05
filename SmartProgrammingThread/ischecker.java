class    ischeckInterrupted extends Thread {
    public void run() {
//        System.out.println(Thread.interrupted()); //  if we interupted the it first make the value from false --> true and after it changes the status from true->false
    System.out.println(Thread.currentThread().isInterrupted());// it does  not change the status form  false ->true and do not update the  status
       try{
           for(int i =0; i<10 ; i++)
           {
               System.out.println(i);
               Thread.sleep(1000);
           }
//               System.out.println(Thread.interrupted());
       }
       catch(Exception e)
       {

           System.out.println("Interrupted");
       }

    }

}

public class  ischecker {


    public static void main(String[] args) {
        ischeckInterrupted  is=new ischeckInterrupted() ;
        is.start();
        is.interrupt(); // in this case the

    }









}

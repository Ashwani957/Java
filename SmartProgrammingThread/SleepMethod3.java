
class Sleeps extends Thread {
    public void run()
    {
       try{
           for(int i = 0 ; i<10; i++)
           {
               System.out.println("I:"+i + Thread.currentThread().getName());
               Thread.sleep(1000);

           }
       }
        catch(Exception e)
        {
            System.out.println("Handle error ");

        }

    }
}
public class SleepMethod3 {


    public static void main(String args[])
    {
//Sleeps sl=new Sleeps();
//sl.start();
//
//Sleeps s2 =new Sleeps();
//s2.start();



//     run() method will execute the only the run method first it will run the run method for sl and then it will run the method for s2

        Sleeps sl=new Sleeps();
       sl.run() ;

        Sleeps s2 =new Sleeps();
        s2.run();
    }
}

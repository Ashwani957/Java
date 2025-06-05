
class TaskOne extends Thread {
    public void run()  {

        for (int i= 0 ;i<5 ; i++)
        {
            try{
        System.out.println("TaskOne:completed");
                Thread.sleep(1000);
            }
            catch(Exception e )
            {
                e.printStackTrace();
            }
        }
    }
}
class TaskTwo extends Thread {
    public void run() {
        try{
            for (int i = 0 ;i<5 ; i++)
            {
                System.out.println("TaskTwo executed :");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class TaksThree extends Thread {
    public void run() {

        try{
            for(int i =0 ; i<5 ; i++)
            {
                System.out.println("TasksThree:");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}


public class Join3  {

    public static void main(String args[]) throws Exception
    {
        TaskOne tone= new TaskOne();
        tone.start();
        TaskTwo two=new TaskTwo();
        tone.join();
        two.start();
        TaksThree t=new TaksThree ();
        two.join();
        t.start();
    }
}

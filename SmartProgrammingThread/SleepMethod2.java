
class Thread1 extends Thread{

    public void run(){

        for(int i = 0 ; i<1000; i++){

        try{
            Thread.sleep(1000);

        }
        catch(Exception e){
            System.out.println("Error facing ");
        }

        System.out.println("Thread1 is running");
        }


    }

}


public class SleepMethod2 {


    public static void main(String args[])
    {
        Thread1 th=new Thread1();
        th.start();


    }
}

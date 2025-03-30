
class Threadone implements Runnable{
    public synchronized  void  run(){

        Thread.currentThread().setName("Ashwnai");
        for (int i=0;i<10;i++){
            try{

                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Thread one");
            // System.out.println(Thread.currentThread().getName());
        }
    }
}
class Threadtwo extends Thread{
    public  synchronized void run(){
        for (int i=0;i<10;i++){
            System.out.println("Thread two");
        }
    }
}

public class Thread11 {
   public static void main(String args[]){
        Threadone t1=new Threadone();
        Threadtwo t2=new Threadtwo();
        Thread p=new Thread(t1);
        Thread p2=new Thread(t2);
        p.start();
        p2.start();
       
   } 
}
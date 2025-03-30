
class MyThread implements Runnable {
    public void run(){
        for(int i = 0 ; i<10 ; i++){


            try {
                Thread.sleep(1000);// it throught the checked exception 
                
            } catch (Exception e) {
                System.out.println(e);
            }
            
            System.out.println("Thread one");

        }
    }
}








public class Threadone{
    public static void main(String args[]){
        

        MyThread t1=new MyThread();
        Thread t2=new Thread(t1);
        t2.start();


    }
}
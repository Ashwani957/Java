//
// without wait and notify we get the error becuase it cannot calculate the value of the total_amount
//class TotalEarning extends Thread {
//    int total_amount=0;
//   public void run (){
//      for(int i = 0 ; i<=10; i++)
//      {
//          total_amount=total_amount+100;
//
//      }
//
//  }
//}
//
//
//public class InterCommunicationThread {
//    public static void main(String[] args) {
//        TotalEarning tearn=new TotalEarning();
//        tearn.start();
//        System.out.println(tearn.total_amount); // it will print the output as zero because it take a time to complete the totalearning loop
//    }
//
//}


// with notify and wait();




class TotalEarning extends Thread {
    int total_amount=0;
    public void run (){
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total_amount = total_amount + 100;
            }
            this.notify();
        }
    }
}
public class InterCommunicationThread {
    public static void main(String[] args)  throws InterruptedException{
        TotalEarning tearn=new TotalEarning();
        tearn.start();
        synchronized(tearn){
            tearn.wait();  // Here main  thread will release the lock and the lock is acquired by the thread: 0 and thread 0 and after the compleiton of the task of thread zero it will notfiy to the main thread with the help of notify() method
        System.out.println(tearn.total_amount);
        }
    }
}


class Threadone  implements Runnable{
    @Override
 public   void run(){
    for(int i = 0 ; i<10 ; i++){
        try {

            Thread.sleep(10000);  
            // use to get the current thread state like runnable , blocked , waiting
            System.out.println(Thread.currentThread().getState()) ;
            // Thread.currentThread().setName("Ashwani");
        }
         catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"First Thread");
    }
 }
}

class Threadtwo implements  Runnable{
    public  void run(){
   
       for(int i = 0 ; i<10 ; i++){
   
        Thread.currentThread().setName("Pankaj");  
        System.out.println(Thread.currentThread().getName()+"Second Thread ");

       }
    }
   }
class Thread1{
    public static void main(String args[]){

        Threadone t1 = new Threadone();
        Threadtwo t2 = new Threadtwo();

Thread p= new Thread(t1);

Thread p2= new Thread(t2);
// in runnable we do not have start method so we have to create object of thread class and pass the object of runnable class
p.start();
p2.start();
    }
}
// synchronized and unsynchronized methods // synchronized method is used to lock an object for exclusive access by a thread.
// synchronized method is used to lock an object for exclusive access by a thread.
// synchronized method is used to lock an object for exclusive access by a thread.
// synchronized method is used to lock an object for exclusive access by a thread.  
// priority in thread 
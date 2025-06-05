 


class MyThread implements Runnable {
    public void run (){
        // taks for thread 
        System.out.println("Thread is running");
    }
}


public class ThreadThree {
    public static void main(String args[]){
        //  Threadone tr1=new Threadone();
        //  Threadtwoo tr2=new Threadtwoo();

        //  tr1.start();
        //  tr2.start();
        
        System.out.println("Thread start Here");
        
        // name of the main  thread 
        
        Thread t= Thread.currentThread();
        String name=t.getName();
        System.out.println("Thread name:"+name);


        // Here we make the instance of my thread 
        MyThread t1=new MyThread();
        Thread t2 = new Thread(t1);
        t2.start();


        //    Here we set the thread name
        t.setName("Ashwani");
        
        //    this will show that the main thread is 
        
        try{
            Thread.sleep(5000);
        }catch(Exception e){
            System.out.println("Exception occur");
            // we can get the thread id 

            
        }
        
        System.out.println(t.getId());


        System.out.println("Thread name is : "+t.getName());

        System.out.println("Thread End Here ");

    }
}

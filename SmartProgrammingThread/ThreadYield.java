public class ThreadYield extends Thread{



    public void run(){
        for(int i = 0 ; i<=5 ; i++)

        {
//            if we want ki ye thrad stop ho jye or main thread run ho tab hum use krte hte thread.yield()
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+""+i);
        }
    }
    public static void main(String args[])
    {
        ThreadYield th=new ThreadYield();

        th.start();
//        if we want ki main method stop ho or another method  exectuion start ho jab hum yiel() method ko ideher likhte h
        Thread.yield();

        for(int i =1 ; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName()+"-"+i);

        }
    }
}

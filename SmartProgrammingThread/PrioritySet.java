
class priority extends Thread{
    public void run(){

//        if we do not set the priority of the Thread then by defualt it inherit the property from the
 System.out.println(Thread.currentThread().getPriority());
 System.out.println("Priority thread will be exectued");

    }
}



class priority2 extends Thread{
    public void run(){

//        if we do not set the priority of the Thread then by defualt it inherit the property from the
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Priority2 will be executed");

    }
}

public class PrioritySet {

    public static void main(String args[])
    {
//        By default the priority of the main thread is 5
        System.out.println(Thread.currentThread().getPriority());
        priority p = new priority();

//        In window it does not set the propority
        p.setPriority(1);
        p.start();

        priority2 p2=new priority2();
        p2.setPriority(10);
        p2.start();

    }
}

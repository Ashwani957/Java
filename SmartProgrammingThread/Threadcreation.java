public class Threadcreation  extends Thread{



    public void run(){
        System.out.println("Running Matter");
    }

    public void run( int a , int b ){
        System.out.println("Hello parameter value ");
    }


    public static void main(String args[])
    {
        Threadcreation th=new Threadcreation();
        th.start();
        th.run(1,2);
    }
}


public class Main {
    public static void main(String args[]){

Compay comp=new Compay();
Producer p =new Producer(comp);
Consumer c =new Consumer(comp);

p.start();
c.start();
    }
}

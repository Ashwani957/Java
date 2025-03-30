// package consumerProducer;
public class Producer extends Thread {
    // Here we make the instance of the company class 
    Compay c ; 
    Producer(Compay c){
        this.c=c ; 
    }
    public void run(){
        int i= 1; 
        while(true){
            this.c.produce_items(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
            // here we produce the item and then sleep for 1 sec
        }
        
    }
}

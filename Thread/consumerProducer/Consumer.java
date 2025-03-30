// package consumerProducer;

public class Consumer  extends Thread{
    
    Compay c; 
    Consumer(Compay c){
        this.c=c; 
    }
    public void run(){
        while(true){
            int i = 1;
            this.c.consume_items(); 
            try {
                Thread.sleep(1000);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            i++;
        }
        
    }
}

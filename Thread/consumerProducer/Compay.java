// package consumerProducer;
public class Compay {
    int n ; 
    boolean f =false ; 
    // if boolean is false then chance of producing items 
    // we make both the function as synchronized because if we produce the item and then consume by consumer 
    synchronized  public void   produce_items(int n ){
        // if f =true then chance of consumer 
        if(f){
        try {
            wait();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        }
        this.n=n ; 
        System.out.println("Produced:"+this.n);
        f=true ;
        notify();
        // notify is used to wake up the consumer thread
        // when we produce the item then we notify the consumer thread
    }
    synchronized  public int  consume_items(){

        if(!f){
            try {
                wait();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consume:"+this.n);
        f=false ; 
        notify();
        return this.n ; 
    }
    // public static void main(String args[]){
 
    // }
    
}

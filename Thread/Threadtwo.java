
class Threadone extends Thread{
    public void run(){
        for (int i = 0 ; i<10 ; i++){

            System.out.println("Threadone");
            try {
                
                Thread.sleep(1000); // it through an checked exception 
                
            } catch (Exception e) {

            }
        }
    }
}
class Threadtwoo extends Thread{
    public void run(){
        for(int i = 0 ; i<10 ; i++){
            System.out.println("ThreadTwo");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Exception occur");
            }
        }
    }
}

public class Threadtwo {
    public static void main(String args[]){
         Threadone tr1=new Threadone();
         Threadtwoo tr2=new Threadtwoo();

         tr1.start();
         tr2.start();

    }
}

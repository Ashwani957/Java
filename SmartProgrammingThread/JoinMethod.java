
// HERE MAIN THREAD WILL BE WAITING FOR THE THREAD:0 EXECTUTION

class First extends Thread {
    public void run() {
        for (int i = 0 ; i<10 ; i++){
            System.out.println(Thread.currentThread().getName()+ ":" + i);
            try{
            Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class JoinMethod {
    public static void main(String args[]) throws Exception
    {
First fs=new First();
fs.start();
fs.join(); // we use the join when we want ki jab hum first thread exceute ho jye auske baad second thread ki exectution start ho
try {
    for (int i = 0; i < 10; i++) {
        System.out.println(Thread.currentThread().getName() + ":" + i);
        Thread.sleep(1000);
    }
}
catch(Exception e ){
    e.printStackTrace();
}
    }
}

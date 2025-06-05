import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Test{


    void read() throws FileNotFoundException{
      
            FileInputStream fs=new FileInputStream("d:/abc.txt");
            
        
    }
}



public class throwskeyword {
        public static void main(String[] args) {
            
            Test t= new Test();

            try {
                t.read();
                
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Hello world ");


        }
}

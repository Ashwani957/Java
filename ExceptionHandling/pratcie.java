

import java.io.FileInputStream;
import java.io.FileNotFoundException;
class Test {

        public void division () throws FileNotFoundException{
            
            FileInputStream fis=new FileInputStream("d:/abc.txt");  

        }

}

public class pratcie {

    public static void main(String[] args)  {
        
        try {
            Test t = new Test(); 
            t.division();
        } catch (Exception e) {
            e.printStackTrace();
        }
     System.out.println("Hello world");
        
    }
}

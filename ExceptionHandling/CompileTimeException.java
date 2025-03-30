import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CompileTimeException{
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("d:/abc.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // FileInputStream fis = new FileInputStream("d:/abc.txt");
 


        // run time exception does not catch by compiler at compile time
int a = 100, b = 0, c;
c = a / b;
System.out.println(c);
       




    }
}
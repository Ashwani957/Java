
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
    // we use throws keyword so that jo b is function readfile wale ko use krega o ise handle karega fileNotfoundException wale ko 

    void readFile() throws FileNotFoundException {
     
        FileInputStream fis=new FileInputStream("d:/abc.txt");  
    }

    void saveFile() throws  FileNotFoundException {
        String text = "This is demo file save";
        FileOutputStream fos =new FileOutputStream("d:/xyz.txt");
    }
}


public class Throws1 {

    // if we use the throws keyword with the main function than 
    public static void main(String[] args)  {
        ReadAndWrite raw = new ReadAndWrite() ;

        try {
        raw.saveFile();
            
        } catch (Exception e) {
            System.out.println("File not found excepiton in handle here");
        }


        try {
            raw.readFile();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Here we handle the exception and handle ");
        
    }
}

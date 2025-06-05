// class ExceptionHandlingOne{
//     public static void main (String ...args)
//     {
//         System.out.println("1");
//         System.out.println("2");
//         System.out.println("3");
//         System.out.println("4");
//         // this part of the programme will change the normal execution of the programme 
//         System.out.println(100/0);// this will show an exception that is arthimetic exception  runtime exception 
//         System.out.println("5");
//         System.out.println("6");
//     }
// }


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CompileTimeExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            FileReader reader = new FileReader(file); // May throw FileNotFoundException
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

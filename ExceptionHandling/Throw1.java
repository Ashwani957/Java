import java.util.Scanner ; 
// Here we choose or extend  unchecked 
// runtimeexcepiton is a child of excepiton 
class YoungerAgeException extends RuntimeException {

     YoungerAgeException(String msg ) {  
        super(msg);//Here we pass the message to the parent classs that is exception 
    }
}

public class Throw1 {
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age ");        
int age = sc.nextInt(); 
try {
    
    
if (age<18 )
{
    // Here programmer print the exception 
    // it will only throw the error 
    // throw are used when the user try to throw its own exception 
    throw new YoungerAgeException("You are not eligible for voting");
}
else {
    System.out.println("You can vote succesfully");
}
} catch (Exception e) {

    e.printStackTrace();
}

    }

}

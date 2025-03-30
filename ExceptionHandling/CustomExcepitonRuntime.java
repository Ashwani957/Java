import java.util.*; 

// when we to created a custome unchecked exception then we need to inherit or extend the RuntimeException 


// Here we create our own exception :

// Unchecked Exception 

class UnderAgeException extends RuntimeException{

    public UnderAgeException() {
        super("you are under age");
    }

    public UnderAgeException(String message){
        super(message);
    }
}
public class CustomExcepitonRuntime {
    public static void main (String ...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the votter");
        int age = sc.nextInt(); 
 
            if (age<18)
        {
              throw new  UnderAgeException("you are under age and cannot vote for it until you become "); 
        }
        else {
            System.out.println("you can vote");
        }

        } 
        
        
    }



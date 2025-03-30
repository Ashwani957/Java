import java.util.*; 

// when we extend exception then it is called compile time exception  

// Checked Exception 

class UnderAgeException extends Exception{

    public UnderAgeException() {
        super("you are under age");
    }

    public UnderAgeException(String message){
        super(message);


    }
}


public class CustomExcepitonHandling {
    public static void main (String ...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the votter");
        int age = sc.nextInt(); 

        try {
            if (age<18)
        {
              throw new  UnderAgeException("you are under age and cannot vote for it until you become "); 
        }
        else {
            System.out.println("you can vote");
        }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

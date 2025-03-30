
public class else_if10{
    public static void main(String args[])
    {
        int age = 2;

        if (age>18){
            System.out.println("you can derive , vote ");

        }
        else if (age>=12&&age<18)
        {
            System.out.println("you are teenager ");
        }
        else {
            System.out.println("you cannot derive and vote  ");
        }
    }
}
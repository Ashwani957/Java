abstract  class vehicles {
    int no_of_wheels; 
     abstract void start();
}

class car extends vehicles {
    void start(){
        System.out.println("Start with key ");
    }
}
class bike extends vehicles {
    void start(){
        System.out.println("Start with kick");
    }
}
public class AbstractionOne {
    public static void main (String ...args)
    {
        car c = new car(); 
        c.start(); 
        bike b = new bike(); 
        b.start(); 
    }
}

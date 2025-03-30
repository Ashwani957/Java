public class hierarchial{


    public static void main (String args[])
    {
 Bird b = new Bird ();
 b.eat();
 fish f = new fish ();
 f.swim();
    }
}

class animal {
    String color; 
    void eat()
    {
        System.out.println ("something is eating");
    }
    void breathe ()
    {
        System.out.println("everyone is breathing");
    }
}
 

class mamals extends animal {

void walk ()
{
    System.out.println("walks");
}
}

class fish extends animal{
    void swim ()
    {
        System.out.println ("fish swim");
    }
}

class Bird extends animal {
    void fly ()
    {
        System.out.println ("only birds fly");
    }
}
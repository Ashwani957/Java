public class overriding {
    public static void main (String args[])
    {
birds b = new birds();
b.eat();

    }
}

// overriding means when parents and base class having same function but different functionality 
class animal {
    void eat()
    {
        System.out.println("animal is eating");
    }
}

class birds extends animal{

    void eat()
    {
        // here we override the eat function 
        System.out.println("bird is eating");
    }
}
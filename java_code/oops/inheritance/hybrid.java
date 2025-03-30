public class hybrid {
    public static void main (String args[])
    {
bird b = new bird ();
b.eat();
fish f = new fish ();
f.eat();


    }
}


class animal {
    void eat()
    {
        System.out.println ("all living thing need food for surivial ");
    }

    void drink ()
    {
        System.out.println ("everyone is drinking ");
    }
}

// single inheritance 
class fish extends animal {
    void swim ()
    {
        System.out.println ("only fish is swimming ");
    }
}
 


class mamals extends animal {
    void walking ()
    {
        System.out.println ("everyone is walking");
    }
}

class bird extends mamals{
    void fly ()
    {
        System.out.println("bird is flying ");
    }
}
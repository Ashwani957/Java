// multiple_level 

public class multi_level {
    public static  void main (String args[])
    {
birds b = new birds ();
b.eats();
    }
}

class animal {
    
    void eats ()
    {
        System.out.println ("eating is done");
    }

void color ()
{
    System.out.println ("color is done ");
}

}


class fish extends animal{
    void name ()
    {
        System.out.println ("shark");
    }
    void color ()
    {
        System.out.println (" black color ");
    }
}

class birds extends fish{
int fly ; 
}
public class supers {
     public static void main (String args[])
     {

        Horse h = new Horse();
        System.out.println(h.colors);

     }
}

class animal {
    String colors; 
    animal ()
    {
        System.out.println("animal constructor is called");
    }
}


class Horse extends animal {

    Horse ()
    {
        // super keyword is used to call the function of the parents class

        super.colors="brown";
        // super();
        System.out.println ("horse constructor is called");
    }
}
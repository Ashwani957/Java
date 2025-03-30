public class inherit {
    public static void main (String args[])
    {
        fish  shark = new fish();
      shark.eat();
    }
}


// base class
  class Animal {
    String colors; 
    void eat ()
    {
        System.out.println ( "eats");
    }


    void breathe ()
    {
        System.out.println ("breaths ");
    }
}


class fish extends Animal{
    int fins ; 


    void swim ()
    {
        System.out.println ("swims in water ");
    }

}
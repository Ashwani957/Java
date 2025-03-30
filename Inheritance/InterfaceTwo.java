interface i1 {


    public static final int a = 12 ; 
     public void run ();
      default void show()
        {
            System.out.println("Interface i1 will be executed");
        }
}

interface i2  {

     public void test();
    
   default  void display()
    {
        System.out.println("Interface i2 will be executed");
    }
}


class third implements  i1, i2 {
    public void show ()
    {
        System.out.println("Multi-level inheritance will be achieve");
    }
   public  void run ()
    {
        System.out.println("running third class");
    }
    public void test()
    {
        System.out.println("Test in third classes is progress");
    }


}



public class InterfaceTwo {
    public static void main(String[] args) {
        third t3=new third(); 
        t3.display();
        t3.show();
        // Here with the help of that we can print the varibale of the interface class 
        System.out.println(t3.a);

    }
}

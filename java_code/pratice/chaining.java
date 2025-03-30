 class chaining {
    public static void main (String args[])
    {
        B oj = new B ();

    }
}


class A {
    //  here we construct a constructor 
     public A()
     {
        System.out.println ("constructor A is calling ");
     }
}

class B extends A {



B ( )

{

    // this will print the current class constructor that contain a parameter
this(7);
// compiler add automatically super class in that call the parents constructor 
    System.out.println ("Constructor b is calling ");
}

// here constructor overloading is done 

B(int a )
{
    System.out.println ("Here constructor  b2222 is call ");
}
}
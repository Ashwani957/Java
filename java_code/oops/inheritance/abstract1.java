public class abstract1 {
    public static void main (String args[])
    {
horse h = new horse ();
h.eat();
h.walk();
h.run();
 
//  first parents constructor is called then its own constructor is call 
System.out.println(h.color);

// 
chicken ch= new chicken ();
ch.walk();
ch.eat();



    }
}



abstract class animal {
String color;
 
 animal()
 {
    color="brown";
 }
    void eat()
    {
        System.out.println ("animal is eating ");
    }
    

// agar hum kise b class ma animal class ko extends(inherit) karte h toa uss ma hume walk function use karna jaruri h nahi to error show karega 
    abstract void walk ();
    
}



class horse extends animal{

    void changecolor ()
    {
        color=" dark-brown";
    }
    void walk ()
    {
        System.out.println ("walk in 4 leg");
    }

    void run ()
    {
        System.out.println ("run fast");
    }
}


class chicken extends animal {
    void changecolor ()
    {
        System.out.println("black color");
    }
    void walk ()
    {
         System.out.println ("walks on two legs  ");
    }
     


}
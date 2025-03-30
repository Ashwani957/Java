//  class Animals{

//     public void eat(){
//         System.out.println("Animal is eating ");
//     }
// }

// public class OopsOne{

// public static void main (String args[])
// {
//     // creation of object 

//     Animals  a1=new Animals(); 
//     a1.eat(); 
// }



// }



// another method of  creating a class

class Birds {
    public void fly( String name ){
        System.out.println("Bird is flying " + name);
    }
}

public class OopsOne{
    public void  run (){
        System.out.println("Animals is running ");
    }


    public void eat(){
        System.out.println("animal is eating");
    }

  


    public static void main (String args[])
    {
        OopsOne animal=new OopsOne(); 

        animal.run(); 
        animal.eat(); 

        Birds b=new Birds(); 
        b.fly("sparrow");

       
         


    }
}
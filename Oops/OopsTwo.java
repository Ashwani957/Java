
//  first method of object insilization in java 

class category{

    String color; 
    int age ; 
    String bread ; 

 

    
}
public class OopsTwo {
    
    public static void main (String args[])
    {

        category cat=new category();
        cat.color="white";
        cat.age=12 ; 
        cat.bread="lebra";

        System.out.println("The color of the animal is ::"+cat.color);
        System.out.println("The age of the animal is ::"+cat.age);
        System.out.println("The breed of the animal is :"+cat.bread);

    }
}



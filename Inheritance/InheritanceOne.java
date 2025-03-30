package Inheritance;
// Single Inheritance 
class Animal {
    void eat(){
        System.out.println("Animal is eating a food");
    }
}

class Dog  extends Animal{

}




public class InheritanceOne{
    public static void main (String [] args)
    {
        Dog d = new Dog(); 
        d.eat(); 

    }
}

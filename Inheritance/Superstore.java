// super keyword are used to call the consturcotr of the parent class


class A {

    A(){
        System.out.println("I a m a consturtor of parent class ") ; 
    }
}

class B extends A {
    B()
    {
        super(); //super keyword are used to call the constructor of the parent class
        System.out.println("I am in class B "); 
    }
       void display()
    {
        System.out.println("I am displaying " ) ; 
    }

}







public class Superstore {
    public static void main(String ...args)
    {

        B b =new B();
        b.display();
    }
}



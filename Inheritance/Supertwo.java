class A {
    void m1(){
    System.out.println("m1 is calling ");

    }
}
class B extends A {
    void show(){
        super.m1(); 
        System.out.println("Child is calling "); 
    }
}
public class Supertwo{
    public static void main (String ...args){
            B b =new B();
            b.show(); 
    }
}


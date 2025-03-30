class A {

    void run ()
    {
        System.out.println("Animal is running ");
    }

}   

class B extends A {
    void eating (){
        System.out.println("animal is eating");
    }
}

class  c extends A {

}
    
    public class InheritanceThree{
        public static void main(String[] args) {
            c c1=new c(); 
            c1.run () ; 
           
        }
    }
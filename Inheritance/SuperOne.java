class A {
int a = 10 ; 
}

class B extends A {
    int a = 20 ; 
    void show (int a){
        System.out.println("The value of a is : "+a);// this will print the variable of the local class
        System.out.println("The value of a is :"+ this.a);// this will print the variable of the current class
        System.out.println("The value of the super class a is :"+ super.a);// this will print the value of the a is parents class
        
    }

   
}



public class SuperOne {
    public static void main(String ...args)
    {
        B b = new B(); 
        b.show(10);
    }
}

class A {
         Object  run () {
            System.out.println("class a is runnign");
            return null ; 
        }
}
class B extends A {
    @Override
    public String run () {
        System.out.println("Class B is running");
        return null ; 
    }
}



public class PolymorphismOverridingFive {
public static void main(String ...args)
{
    A a = new A(); 
    a.run(); 
}

}


class Test {


    void show (int a )
    {
        System.out.println("Int method is calling ");
    }
    void show (String a )
    {
        System.out.println("String method is calling ");
    }
}






public class PolymorphismThree {

    public static void main (String ...args)    
    {
        Test t=new Test(); 

        t.show(1);
        // when we pass char as string then it typcast or automatic promotion to int and we get a output int is calling 
        t.show('a');
        // t.show ("abc");
    }
}

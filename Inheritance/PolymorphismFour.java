
// example 1 
// class Test {
//     void show (Object a)
//     {
//         System.out.println("Object method is calling ");
//     }
//     void show (String a )
//     {
//         System.out.println("String method is calling");
//     }
// }


// example2 



class Test {
    void show (StringBuffer a )
    {
        System.out.println(" String Buffer is calling ()");
    }
    void show (String a )
    {
        System.out.println("String method is calling");
    }
}




public class PolymorphismFour{
    public static void main (String ...args)
    {

        // for example 1
        // //  
        // Test t = new Test(); 
        // // Here obejct method is calling because the object method is the parent of the all the datatype in java

        // t.show(2);



        // for example 2 


        Test t = new Test(); 
        // this will call a normal string method 

        t.show("abc");

        // this will call the string buffer method 
        t.show(new StringBuffer("abcd"));
// Here  compiler will face a problem because  null method is contain by both string and stringBuffer 

t.show (null);
    }
}



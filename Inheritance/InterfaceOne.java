
interface  in {


    // int b =100;  we cannot create a variable like this but we can create a varibale like this :
    public static final  int a = 10 ; 
    public void show (); 
}



class child implements  in {

   public void show (){

        System.out.println("Interface is implements ");

    }

}



public class InterfaceOne {
    public static void main(String ...args)
    {
        // we cannot create a obejct of the interface similar to the abstract classes 

        // in n = new in();   // this will show an errror that in cannot be insitated 
        // n.show (); 

         child ch = new child (); 
         ch.show(); 

    }
}

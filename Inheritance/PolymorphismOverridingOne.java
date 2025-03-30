

// overriding start one 
class Test {
    public void show () {
        System.out.println("TEst is calling ");
    }
}
class Homework extends Test {

    @Override
    public void show (){
        System.out.println("Homework class is calling ");
    }
}



public class PolymorphismOverridingOne {

    public static void main(String[] args) {
        
        Test t = new Test(); 
        t.show(); 
        Homework hm=new Homework();
        hm.show(); 
    }
      


}

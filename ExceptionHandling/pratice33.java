public class pratice33 {

    public static void main(String args[]){
     int a = 10 , b = 0 , c; 

     try{
        System.exit(0);
     }
     catch(Exception e){
         e.printStackTrace();
     }
     finally{
         System.out.println("Finally block executed");
     }

    }
}

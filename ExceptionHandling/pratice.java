public class pratice {
    
    public static void main(String[] args) {
        
       
   
      System.out.println(getvalue());


    }

   
    static int getvalue(){
        try {
            return 10 ; 
           
        }  
        finally{
            System.out.println("finally blocked executed");
        }
      
    }
}

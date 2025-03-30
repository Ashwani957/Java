public class Throw {

public static void main(String[] args) {


int a = 100 , b = 0 , c ; 

try {
c=a/b;

    
} catch (Exception e) {
    System.out.println(e);// errorName:java.lang.ArithmeticException: // description: by zero
}
System.out.println("Hello world");


}


}


// example 2 



// public class Throw {
//     void display ()
//     {
//         try {
     
//             int a = 100 , b = 0 , c ;
//             c=a/b;   
//         } catch(ArithmeticException e) {
//             e.printStackTrace();
//         }
//     }
//     public static void main(String[] args) {
// Throw t = new Throw();
// t.display(); 
// System.out.println("Programmer is successfully executed");
//     }
//     }
    
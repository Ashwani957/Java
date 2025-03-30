// public class FinalOne {
//     public static void main(String[] args) {

//         // Here we face an error that we cannot change the value of the  final keyword i 
//         final int i = 10 ; 
//         i=i+10; 
//         System.out.println("i"+i);
//     }
// }


//example 2  : in example two we made a  final method : final method is not  override by any other 

// class A {
//  final void demo ()
// {
//     System.out.println("Demo in A");
// }
// }

// class B extends A {

//  @Override// final method cannot be override so if we try to overide then it will show an error 
//     void demo () {
//         System.out.println("Demo succesfuuly override");
//     }
//      void demo2 () {
//         System.out.println("Demo 2 B");
//      }

     
// }
// public class FinalOne {
//     public static void main(String[] args) {

//         B b =new B (); 
//         b.demo();
        
//     }
// }


// example3  : final classes is not inherit by any other classes 



//  final class A {
//  final void demo ()
// {
//     System.out.println("Demo in A");
// }
// }


// // this will show an error because we cannot inherit final class 
// class B extends A {

//  @Override// final method cannot be override so if we try to overide then it will show an error 
//     void demo () {
//         System.out.println("Demo succesfuuly override");
//     }
//      void demo2 () {
//         System.out.println("Demo 2 B");
//      }

     
// }
// public class FinalOne {
//     public static void main(String[] args) {

//         B b =new B (); 
//         b.demo();
        
//     }
// }
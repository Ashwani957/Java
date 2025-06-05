

// example1: static variable

//  class Test {
//      static int a = 12 ; // we can delcare static varibel only with in the class and outside the body of the method 
//     //  void m1(){               
//     //  static int b  = 122; // show an error because we cannot declare the static varibale inside the method 
//     //  }
//  }



//  public class StaticOne {
    
//      public static void main (String ...args)
//      {

//         System.out.println(Test.a);// we can print the static varibale with the help of the  calss name 

//      }
//  }





// example2 
// class Test {
//     static int a = 12 ; // we can delcare static varibel only with in the class and outside the body of the method 
//     void m1(){
//     //  static int b  = 122;// show an error because we cannot declare the static varibale inside the method  because static variable is created only once when the jvm load the class and  remain in entire lifetime of the programe
//     }
// }
// public class StaticOne {
    
//     public static void main (String ...args)
//     {

//     }
// }


// example 3 : we declare any varibale as static because it is shared by everyone and  only store one time in memory 
 
 

// class Employee {

//     int emp_id ; 
//     String name ; 
//     static String company="software engineering ";
//     Employee(int emp_id, String name)
//     {
//         this.emp_id =emp_id ; 
//         this.name=name ; 

//     }

//     void displayData(){
//         System.out.println("The details of the employee" +this.emp_id+" "+ this.name + " "+ company );
//     }

// }

// public class StaticOne{
//     public static void main (String ...args)
//     {
//         Employee e1 =new Employee(12, "ashwani");
//         Employee e2 =new Employee(13,"sahil");
//         e1.displayData();
//         e2.displayData(); 
        
//     }
// }


// example 4 :
// class Counterdemo{
//     int count=0 ; 
//     Counterdemo()
//     {
//         System.out.println(count);
//         count++;
//     }
// }
// public class StaticOne{
//     public static void main (String ...args)
//     {
//             Counterdemo cd =new Counterdemo(); 
//             Counterdemo cd1 = new Counterdemo();
//             Counterdemo cd2 =new Counterdemo(); 
//             Counterdemo cd3 = new Counterdemo(); 

//     }
// }


// example 4 :  static method :  static method are call with  help of   class




// class Employees {
//    static void display ()
//     {
//         System.out.println("Display is running");
//     }
// }


// class StaticOne {

//     public static void main(String ...args)
//     {
//            display();  // we can call the static method with in the same class without use of the parent class name 

//     }
// }
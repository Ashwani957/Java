package Inheritance;

// Multilevel Inheritance 
class Animal{
    void property()
    {
        System.out.println("Animal property ");

    }
}
class Bird extends Animal {

    void chirpring() {
        System.out.println("Bird is charming");
    }

}
class cat extends  Bird{


    void  drink () {
        System.out.println("cat drink milk");
    }

}


public class InheritanceTwo{


    public static void main (String ...args)
    {
cat c = new cat(); 
c.drink();
c.chirpring();
c.property();
    }
}



























































































// Here we want to set the value of class  A with the help of constructor of B class

// class A{
//     String name ; 
//     int age ; 
//     int emp_id ; 

  
//         A(String name , int age , int emp_id)
//         {
//             this.name = name ; 
//             this.age =age; 
//             this.emp_id= emp_id ; 
//         }

//         public void display() {
//             System.out.println("The details of the employee is show below :::");
//             System.out.println("The name of the employee is ::"+name);
//             System.out.println("The age of the employee is :::"+ age);
//             System.out.println("The emp_id of the employee is :::"+ emp_id);
//         }
// }
// class B extends A{

//             B(String name , int age , int emp_id )
//             {
//                 super(name , age , emp_id );
//             }
// }

 
// public class InheritanceTwo{
//     public static void main(String[] args)
//     {
//         // B b = new B("ashwani ", 12 , 111); 
//         B b = new B("ashwnai",12 ,1111); 
//         b.display();
        
//     }
// }

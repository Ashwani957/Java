// this keyword uses 




// first use 
// public class ConfilictsTwo {

//     int i ; 


//     void  set (int i )
//     {
//         this.i =i ; 
//     }

//     void display()
//     {
//         System.out.println("The value of the i is :::"+ i );
//     }

//     public static void main (String ...args)
//     {
//         ConfilictsTwo ct=new ConfilictsTwo(); 
//         ct.set(1);
//         ct.display();
//     }
    
// }


// second use :  this keyword are used to invoke the method in the class 



// public class ConfilictsTwo {

//     int i ; 


//     void  set (int i )
//     {
//         this.i =i ; 
//     }

//     void display()
//     {
//         System.out.println("Display will be run ");
//     }

//     void show (){
//         display();// Here the compiler will add this automatically  : this.display(); 

//     }

//     public static void main (String ...args)
//     {
//         ConfilictsTwo ct=new ConfilictsTwo(); 
//         ct.show(); 
        
        
//     }
    
// }




// example 3 : this keyword are used to call the consturctor of the class  


// public class ConfilictsTwo {



//         ConfilictsTwo()
//         {
//             System.out.println("no argument constructor");
//         }

//         ConfilictsTwo(int a )

//         {
//             this() ; // this will call the  no argument constructor 
//             System.out.println("argument constructor");
//         }
//     public static void main (String ...args)
//     {
//         // ConfilictsTwo ct=new ConfilictsTwo(); // this will call the no arugment constructor 


//         ConfilictsTwo ct=new ConfilictsTwo(10);  // this will call the argumnet constructor 

        
        
        
//     }
    
// }


// example 4 : this keyword are used to pass  as an argument in the method call 




// public class ConfilictsTwo {

//         void m1(ConfilictsTwo t2)
//         {
//             System.out.println("Im in the method m1");

//         }

//         void m2 ()
//         {
//             m1(this);
//         }

   
// public static void main (String ...args)
// {
//     // ConfilictsTwo ct=new ConfilictsTwo(); // this will call the no arugment constructor 


//     ConfilictsTwo ct=new ConfilictsTwo();  // this will call the argumnet constructor 

//     ct.m2(); 
    
    
// }

// }


// example5 : this keyword can be used to return the current class instance from the method 


public class ConfilictsTwo {

    ConfilictsTwo m1(){
        return this ; 
    }

public static void main (String ...args)
{
// ConfilictsTwo ct=new ConfilictsTwo(); // this will call the no arugment constructor 


ConfilictsTwo ct=new ConfilictsTwo();  // this will call the argumnet constructor 

 System.out.println(ct.m1());


}

}




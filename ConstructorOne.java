//  example1
// default constructor created by the compiler 
// public class ConstructorOne {
    
//     int i ; 
//     String s ; 




//     public static void main (String[] arg)
//     {
//         ConstructorOne one = new ConstructorOne(); 

//         // value of defaul int constructor  : 0
//         System.out.println(one.i);
//         // value of default string constructor : null
//         System.out.println(one.s);
//     }
// }


// example 2 
// no argument constructor 

// public class ConstructorOne{

 

// ConstructorOne(){
//     System.out.println("no argument construction ");

// }
//     public static void main (String[] args)
//     {

//             ConstructorOne  noargu=new ConstructorOne();
          



//     }
// }


// example 3 : Parametrized constructor 



public class ConstructorOne{

 

    ConstructorOne(int a ){
        System.out.println("Parametrized constructor "+ a );
    
    }
        public static void main (String[] args)
        {
    
                ConstructorOne  Parametrized=new ConstructorOne(2);
                


              
    
    
    
        }
    }

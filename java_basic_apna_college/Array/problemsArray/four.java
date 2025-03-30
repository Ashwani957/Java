class four {

public static void swap (int a , int  b )
{
    System.out.println("The value of a before swap is : "+ a);
    System.out.println("The value of b before swap is : "+b);
    // swapping using third variable 
    // int temp ; 
    // temp=a; 
    // a=b ;
    // b=temp; 

    // swapping without using the third variable 

        a=a+b ; 
        b=a-b; 
        a=a-b;

    System.out.println("The value of a after swap is : " +a);
    System.out.println("The value of b after swap is :" +b);
}
    public static void main (String[] args)
    {
        int a = 2 ; 
        int b = 4; 
      swap(a,b );

     




    }
}
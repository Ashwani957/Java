
class Calculation {

     public void  sum  (int a , int b)
     {
            int c = a+b ; 
            System.out.println("The Sum of two number is " + c );


     }
      public void sum ( int a ,int b , int c )
      {
        int sum  = a+b +c ; 
        System.out.println("The sum of "  +  a + b + c + " is " + sum );
      }

      public void sum (int a , float b , float c )
      {
       float  sum = a+b+c; 
        System.out.println("The sum of "+ a +" " + b + " " + c + "is " + sum );

      }

    //   sequence of argument 
      public void sum (float a , int b )
      {
        float sum = a+b;
        System.out.println("The sum of "+a+ " "+ b + "  is " + sum  );


      }
        public void sum (int a , float b )
        {
            float sum = a+b ; 
            System.out.println("The sum of a and b is :"+ a+""+b+" is  " + sum  );
        }

        

}





public class PolymorphismOne {
            public static void main (String ...args)
            {
                Calculation cal=new Calculation(); 
                cal.sum(12, 12);
                cal.sum(12,12,12);
                    cal.sum(10,10.5f,10.5f);
                    cal.sum (12,12.5f);
                    cal.sum(12.5f,12);

            }
}

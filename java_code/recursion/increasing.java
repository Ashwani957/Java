public class increasing {


    public static void incorder(int number)
    {
        if (number==1)
        {
            System.out.println (number);
            // this return will exit the  function  
            return ; 
        }
incorder(number-1);
System.out.println(number);


    }

    public static void main (String args[])
    {

        int n = 10 ; 
        incorder(n);

    }
}
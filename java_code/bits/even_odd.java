

public class even_odd{

public static void even_odd(int number)
{
    
    int maskbit=1; 
    if ((number & maskbit)==0)

    {
// even number
System.out.println("even number");

    }
    else {
        System.out.println ("odd number");

         
    }                               
}

    public static void main (String args[])
    {
even_odd(3);
even_odd(4);
even_odd(32);
    }
}

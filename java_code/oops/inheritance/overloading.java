public class overloading{
    public static void main (String args[])
    {
calculator cal = new calculator ();
System.out.println(cal.sum((float)1.5, (float)1.6));
System.out.println(cal.sum(1,2,5));
System.out.println(cal.sum(12,12));


    }
}

class calculator {

// function overloading are done here 
    int sum (int a, int b )
    {
        return a+b ; 
    }

int  sum (int a , int b , int c )
{
    return a+b +c ; 

}


float sum (float a , float b )
{
    return a+ b ;
}

}
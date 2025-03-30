public class get_set{
    public static void main (String args[])
    {

pen p1= new pen ();
p1.setcolor("green");
p1.settip(12);
System.out.println (p1.getcolor());
System.out.println(p1.gettip());

    }
}
// with the help of set and get we access the private as specifiers 


class pen {
    private String pen ; 
     private int tip ; 



String getcolor ()
{
    return this.pen ;   
    
}

int gettip()
{
    return this.tip;
}







     void setcolor (String name )
     {
    pen = name ; 
     }


void settip (int tipname )
{
    tip = tipname ; 
}

}
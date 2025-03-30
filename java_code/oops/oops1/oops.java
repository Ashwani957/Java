public class oops{

    public static void main (String args[])
    {
         // with the help of new keyword we create or allocate a space 
 pen p1 = new pen();// create a pen object called p1
// allocate color to pen 
p1.setcolor("green");
System.out.println (p1.color);

p1.settip(12);
System.out.println(p1.tip);
    }
   
}


class pen{
    String color ; 
    int tip;
    // function inside pen class
        void setcolor (String newcolor)
        {
            color= newcolor; 
        }

        void settip(int newtip)
        {
                tip= newtip;
        }
}


class student{


String name ; 
int age ; 
float percentage ; 
void callpercentage (int phy , int  chem , int math )
{

}
}
public class print{
    public static void printbuilder(int n , int lastplace , String str)
    {

        // if (lastplace==0)
        // {
        //     // sit 0 on chair n 
        //     printbuilder (n-1, 0, str.append ("0"));
        //     printbuilder (n-1, 1, str.append ("1"));
        // }

        // else {
        //     printbuilder(n-1, 0 , str.append("1")); 
        // }



// base case 
 if (n==0 )
 {
    System.out.println (str);
return ;    
 }

//  kaam\

printbuilder(n-1,0,str+"0");
if (lastplace==0)
{
    printbuilder(n-1,1,str+"1 ");
}



    }

    public static void main (String args[])
    {
printbuilder(3,0,"");
    }
}
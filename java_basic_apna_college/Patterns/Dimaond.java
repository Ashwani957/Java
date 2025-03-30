public class Dimaond {

//     * 
//     ** 
//    ***** 
//   ******* 
//   ******* 
//    ***** 
//     *** 
//      * 
public static void DiamonPattern (int number)
{
    // first half of the diamond pattern 
    for (int row=1 ; row <=number ; row++)
    {
        for (int col=1 ; col<=number-row; col++)
        {
            System.out.print(" ");
        }
        for(int star =1 ; star<=(2*row)-1; star++)
        {
            System.out.print("*");

        }

        System.out.println(" ");
    }

// 2nd half the  diamon pattern 

for (int row=number ; row >=1 ; row--)
{
    for (int col=1 ; col<=number-row; col++)
    {
        System.out.print(" ");
    }
    for(int star =1 ; star<=2*row-1; star++)
    {
        System.out.print("*");

    }
    System.out.println(" ");
}





}


    public static void main (String args[])


    {
DiamonPattern(4);

    }
    
}

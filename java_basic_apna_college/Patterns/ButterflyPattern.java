// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *

public class ButterflyPattern {


    public static void butterfly (int number )
    {

        //1st half pattern 
        for (int i=1 ; i<=number ; i++)
        {
            // start - i 
            for (int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            //space - 2*(number-i )

            for (int j = 1; j<=2*(number-i); j++)
            {
                System.out.print(" ");
            }

                        //start - i 
            for (int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

            // for mirror images we have 
            for (int i=number ; i>=1; i--)
            {

                for (int j=1 ; j<=i ; j++)
            {
                System.out.print("*");
            }

                // for space purpose 
                for (int j = 1 ; j<=2*(number-i); j++)
                {
                        System.out.print(" ");
                }

                // star purpose 
                for (int j = 1; j<=i ; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
                

            }
    }
    public static void main (String args[])
    {
        butterfly (5);

    }
    
}

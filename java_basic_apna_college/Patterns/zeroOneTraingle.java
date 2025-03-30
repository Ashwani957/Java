public class zeroOneTraingle {

    public static void ZeroTraingle (int rowlength )

    {

        for (int row=1; row<=rowlength ; row++)
        {

            for (int col=1 ; col<=row ; col++)
            {

                if ( (row+col)%2==0)
                {
                    System.out.print("1");
                   
                }
                else {
                    System.out.print("0");
                }


            }
            System.out.println(" ");
        }

    }
    public static void main (String args[])
    {
        ZeroTraingle(5);

    }


}


// pattern 

// 1 
// 01 
// 101 
// 0101 
// 10101 
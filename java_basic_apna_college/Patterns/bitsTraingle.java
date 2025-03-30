public class bitsTraingle {

    public static void bitsTraingles (int number)
    {
        for (int row =1 ; row <=number ; row++)
        {
            for (int col=1 ; col<=row; col++)
            {
                if ((row+col)%2==0)
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
bitsTraingles(4);
    }
}

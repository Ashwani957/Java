public class InvertedHalfPyramidWithNumber {
    


    public static void invertedhalfPyramidNumber(int n)

    {
        for (int row=1 ; row<=n; row++)
        {

            for (int col=1 ; col<=n-row+1 ; col++)
            {
                System.out.print(col);
            }
            System.out.println("");
        }


    }
    public static void main (String args[])
    {
        invertedhalfPyramidNumber(6);
    }
}

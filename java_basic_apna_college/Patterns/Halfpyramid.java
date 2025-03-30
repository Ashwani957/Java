public class Halfpyramid {

    public static void Halfpyramid(int row , int col)

    {        // for first row 
        for (int i = 1 ; i<=row ; i++)
        {
            // for space purpose 
            for (int j = 1 ; j<=row-i ; j++)
            {
                System.out.print(" ");
            }

            // for star portion 
            for (int star = 1; star<=i ; star++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    
    }
    public static void main (String args[])
    {
        Halfpyramid(4, 4);

    }
}

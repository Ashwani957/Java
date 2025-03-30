public class SolidRohombus {

    public static void rohombus (int number){

        // outer loop
        for (int row = 1 ; row<=number ; row++)
        {
            for (int coloum =1 ; coloum<=(number-row);coloum++)
            {
                System.out.print(" ");
            }
            for (int j=1 ; j<=number; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
       
    }
    public static void main (String args[])
    {
        rohombus(4);

    }
}

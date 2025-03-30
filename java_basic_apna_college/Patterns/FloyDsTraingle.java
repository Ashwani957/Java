public class FloyDsTraingle {

    public static void floydsTraingle(int number)
    {

        // this counter will help us to print all the number because at every iteration this counter will be increase 
        int counter = 1; 

        for (int row = 1 ; row <=number ; row++)
        {
            for (int col=1 ; col<=row ; col++ )

            {
                System.out.print(counter+" ");
                counter++; 
            }
            System.out.println(" ");
        }
    }
    public static void main (String args[])
    {
floydsTraingle(3);

    }
    
}

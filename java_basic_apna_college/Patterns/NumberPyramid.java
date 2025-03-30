public class NumberPyramid {


    public static void numberpyramid (int number)

    {
        for (int row=1 ; row<=number ; row++)
        {

            // we can get a formula of this by using  number = space + row 
            for (int space=1 ; space<=number-row; space++)
            {
                System.out.print(" "); 

            }

            for (int digit=1  ; digit<=row ; digit++)

            {
                System.out.print(row+" ");

            }
            System.out.println(" "); 
        }
            
    }
    public static void main (String args[])
    {
numberpyramid(4); 
    }
    
}

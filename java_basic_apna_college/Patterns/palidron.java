public class palidron{

    // palindromic structure of number 
//      1 
//     212
//    32123
//   4321234
//  543212345


    public static void palindromic(int number )
    {

        for (int row=1 ; row<=number ; row++)
        {
            for (int space=1 ; space<=number-row; space++)
            {
                System.out.print(" ");
            }
            // for (int dec=row  ; row>0 ; row--)
            // {
            //     System.out.print(dec);
            // }

            for (int dec=row ; dec>=1 ; dec--)
            {
                System.out.print(dec);
            }
            for (int inc=2 ; inc<=row; inc++)
            {
                System.out.print(inc);
            }
            System.out.println(" ");
        }
    }
    public static void main (String args[])
    {
        palindromic(5);
    }
}
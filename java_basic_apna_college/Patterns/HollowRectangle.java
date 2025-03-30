import java.util.Scanner;
public class HollowRectangle {
    public static void hollow_rectangle(int totalrow,int totalcol)
    {
                    for(int i = 1 ; i<=totalrow ; i++)
            {
                // inner coloum 
                for (int j = 1; j<=totalcol; j++)
                {
                    //cell -(i,j)
                    if (i==1 || i==totalrow || j==1 || j==totalcol)
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
    }
    public static void main (String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the value of col");
        int totalcol=sc.nextInt(); 
        System.out.println("Enter the value of row ");
        int totalrow=sc.nextInt(); 
        hollow_rectangle(totalrow, totalcol);
    }
    
}

// pattern 
// **** 
// *  * 
// *  * 
// *  * 
// **** 
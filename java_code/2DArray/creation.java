import java.util.*; 

public class creation{


    public static void main (String args[])
    {

        // creation of 2D-ARRAY 
         int matrix[][]=new int[3][3];
// matrix.lenght it gives us the length of row and matrix[0] it gives us the length of coloum 
         int n = matrix.length , m = matrix[0].length; 
          Scanner sc= new Scanner (System.in );
        //   input purpose 
for (int i = 0 ; i<n; i++)
{
    for (int j = 0 ; j<m ;j++)
    {
    matrix[i][j]=sc.nextInt();
    
    }
}

//output 
for (int i = 0 ; i<n ; i++)
{
    for (int j = 0 ; j< m ; j++)
    {
        System.out.print(matrix[i][j]+" ");
    }
    System.out.println ();
}



    }
}
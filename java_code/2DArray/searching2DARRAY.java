import java.util.*; 

public class searching2DARRAY{
 


// function creation to search a number is presenting inside or not 

public static boolean  searching (int matrix[][], int key )
{
    for (int i = 0 ; i<matrix.length ; i++)
    {
        for (int j = 0 ; j<matrix[0].length; j++)
        {
            if (matrix[i][j]==key )
            {
                System.out.println ("found cell at ("+ i +","+j+")");
                return true ; 
            }
        }
    }

    System.out.println ("key not found ");
    return false ;
}



    public static void main (String args[])
    {

        int matrix[][]=new int [3][3];

int n = matrix.length , m = matrix[0].length;
Scanner sc= new Scanner (System.in);

// input 

for (int  i = 0 ; i<n ; i++)
{
 for (int j = 0 ; j<m ; j++)
 {
     matrix[i][j]=sc.nextInt();
 }
}

// output 



for (int  i = 0 ; i<n ; i++)
{
 for (int j = 0 ; j<m ; j++)
 {
   System.out.print(matrix[i][j]+" ");
 }
 System.out.println ();
}

int key = 5; 
searching(matrix, key );













    }
}
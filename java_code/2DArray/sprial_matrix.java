// import java.util.*; 
public class sprial_matrix{

public static void printSprial (int matrix[][])
{
    int startrow= 0 ; 
    int endrow= matrix.length-1; 
    int startcoloum=0;
    int endcoloum=matrix[0].length-1; 


    // condition of loop 
    while(startrow<=endrow &&startcoloum<=endcoloum)
    {
        // this condition for print of first coloum (J)

        // top boundary 
        for (int j=0 ; j<=endcoloum;j++)
        {
            System.out.print (matrix[startrow][j]+" ");
        }

        // Right coloum 

// here we use startrow+1 because we want to start the iteration from second row 
// row change and coloum become fix ;
        for (int i =startrow+1; i<=endrow; i++ )
        {
            System.out.print(matrix[i][endcoloum]+" ");
        }

// bottom  boundary 

for (int j=endcoloum-1; j>=startcoloum;j--)
{
    if (startrow==endrow)
    {
        break ; 
    }

    System.out.print(matrix[endrow][j]+" ");
}

//left  
for (int i =endrow-1; i>=startrow+1; i--)
{

    
    if(startcoloum==endcoloum)
    {
            break ; 
    }
    System.out.print (matrix[i][startcoloum]+" ");

}

startcoloum++;
startrow++;
endrow--; 
endcoloum--; 
    }

    System.out.print(" ");
}






    public static void main (String args[])
    {
        int matrix [][]={{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};

                    printSprial(matrix);
    }
}
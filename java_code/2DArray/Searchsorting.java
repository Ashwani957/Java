public class Searchsorting{

    public static  boolean staircaseSearch(int matrix[][],int key) 
    {
        int row = 0 , col= matrix[0].length-1;
        while (row<matrix.length && col>=0)
        {
            if(matrix[row][col]==key)
            {
                // print the index where we found
                System.out.println ("found key at ("+row+","+col+")");
        return true ; 
            }

            // If the value of the key is less than the vlaue of matrix[row , col] then move to left (notes see)

            else if (key<matrix[row][col])
            {
                col--; 
            }
            else {
                // if the value of key is more than the matrix [row , col] then move toward bottom 

                row++; 
            } 
     
        }

        System.out.println("key is not found ");
        return false ; 
    }
    public static void main (String args[])
    {
        int matrix [][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}};
        int key = 33; 
        staircaseSearch(matrix,key);
    }
}
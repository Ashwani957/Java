 

public class linearSearch {

    public static void linearsearch(int array1[])
    {
        int key =10 ; 
        for (int i = 0 ; i<array1.length; i++)
        {
            if (array1[i]==key)
            {
                System.out.print("Element found at index" +" "+i );
            }
        }
    }
    
    public static void main (String args[])
    {
        int array1[]={1,2,3,4,5,6,7,8,9,10};
        linearsearch(array1);

    }
}

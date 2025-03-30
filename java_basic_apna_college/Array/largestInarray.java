 
public class largestInarray {
    public static void largestarray(int array1[])
    {
        int largest = 0 ;
        for(int i = 0 ; i<array1.length; i++)
        {
            if (array1[i]>largest)
            {
                largest = array1[i];
            }
        }
        System.out.print(largest);
    }
    public static void main (String args[])
    {
        int array1[]={11,2,4,5,277,88};
        largestarray(array1);

    }
}

public class clone2Array {

    public static void main (String[] args)
    {
        int array[]={1,2,3,45,5}; 

        int [] array1=array.clone(); 

        System.out.println("array1 before updation ");

        for (int i = 0 ; i<array1.length; i++)
        {
            System.out.print( array1[i]+ " ");
        }
System.out.println("");

        // updation of array1 

        array1[0]=12 ; 
        array1[1]=23 ; 

        System.out.println("array1 after updation of the code "); 
        for (int i = 0 ; i<array1.length ; i++)
        {
            System.out.print(array1[i] + " ");
        }

System.out.println(" ");


// the  updation of the array1 will not affect the array because it create a clone of the refernce and also allocate a extra memeory in the heap

        
        System.out.println("array after updation of the code the array 1  "); 
        for (int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }


    }
    
}

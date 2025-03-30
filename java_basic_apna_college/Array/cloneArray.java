public class cloneArray {

    // public static int cloning(int arr[])
    // {

    // }
    public static void main (String[] args)
    {
        int array []= {1,2,4,5,3};

        int array2[]=array ; 

        // 
        System.out.println("array 1 ");

        for (int i = 0 ; i<array.length; i++)
        {
            System.out.print(array2[i] + " ");
        }
       
        System.out.println("array2 before updated");

        for (int i = 0 ; i<array2.length; i++)
        {
            System.out.print(array2[i] + " ");
        }

        // array two after changes 

            array2[0]=0; 
            array2[1]=1111; 


            System.out.print("array 2 after updated");
        for (int i = 0 ; i<array2.length; i++)
        {
            System.out.print(array2[i] + " ");
        }


        // array1 after upadated 

        System.out.println("array 1 after change of the value of array2");

        for (int i = 0 ; i<array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

    }
}

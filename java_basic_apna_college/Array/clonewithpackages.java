
import java.util.Arrays;

public class clonewithpackages {
    

    public static void main (String[] args)
    {


         int array1 []= {1,2,3,4,5};


         
         System.out.println("The array 1 is before updation  : ");
        for (int i = 0 ; i<array1.length; i++)
        {
           System.out.print(array1[i]+ " ");


        }

        System.out.println(" ");

        //  copy the array 1 to new array2 with same length 
         int array2[]=Arrays.copyOf(array1,array1.length); 

         System.out.println("The array 2 before updation ");

         for (int i = 0 ; i<array2.length; i++)
         {
            System.out.print(array2[i]+ " ");


         }

         System.out.println(" ");

        // updation of the array 
        array2[0]=100;

        array2[1]=200;

        System.out.println("The array2 after updation ");

        for (int i = 0 ; i<array2.length; i++)
        {
           System.out.print(array2[i]+ " ");


        }

        System.out.println(" ");

        System.out.println("The array 1 is after  updation of array 2   : ");
        for (int i = 0 ; i<array1.length; i++)
        {
           System.out.print(array1[i]+ " ");


        }



    }
}

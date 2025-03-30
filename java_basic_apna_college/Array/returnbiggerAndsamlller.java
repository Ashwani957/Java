import java.util.Arrays;

class returnbiggerAndsamlller{

public static  int [] bs(int arr[])
{
    Arrays.sort(arr);
    int [] ans={arr[0],arr[arr.length-1]};
    return ans ;
 
}
    public static void main (String[] args)
    {
         int arr[]={4,3,56,61,23}; 

         int result[] = bs(arr); 

        System.out.println("smallest" +result[0]);
        System.out.println("largest" + result[1]);


    }
}
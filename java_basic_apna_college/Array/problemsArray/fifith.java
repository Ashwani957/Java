// reverse a given array using the another array 
class fifith{

public static int[] reverseArray (int [] arr)
{
    int n = arr.length ; 
    int [] ans=new int [n];
    int j = 0 ; 

    for (int i = n-1; i>=0; i--)
    {   
        ans[j++]=arr[i];

    }
    return ans ; 
}

    public static void main (String[] args)
    {
        int array[]={1,2,3,4,5};
      int [] result=  reverseArray(array);
      System.out.println(result);
      for (int i = 0 ; i<result.length; i++)
      {
        System.out.println(result[i]);
      }
    }
}

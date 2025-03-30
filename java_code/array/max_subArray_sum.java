 import java.util.*; 

public class max_subArray_sum {
    public static void maxSubArraySum(int array[])
    {

        int currentSum = 0 ; 
        int maxSum=Integer.MIN_VALUE;

        for (int i = 0 ; i<array.length ; i++)
        {
            int start = i ; 
            for (int j =i ; j<array.length ; j++)
            {
                int end = j ;
                currentSum=0; 
                for (int k= start ; k<=end ; k++)
                {
                        currentSum+=array[k];
                }

              System.out.println (currentSum);
                if (maxSum<currentSum)
                {
                    maxSum=currentSum;
                }
            }
        }
System.out.println ("max sum is :::"+maxSum);
    }


    public static void main (String args[])
    {
        int array []={1,4,6,8,10,12,14};
        maxSubArraySum(array);
    }
}

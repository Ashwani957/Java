import java.util.*; 

public class kadan_algorithm{
    
    public static void kadan(int number[])
    {
        int maxsum=Integer.MIN_VALUE;
        int currentsum = 0 ; 

        for (int i=0 ; i<number.length; i++)
        {
            currentsum=currentsum+ number[i];
            if(currentsum<0)
            {
                currentsum=0 ; 
            }
// to store the maximum value we use 
    maxsum=Math.max(currentsum,maxsum);
        }

        System.out.println("our maximum subarray sum is :::"+maxsum);
    }
    public static void main (String args[])
    {

int number[]={-2,-3,4,-1,-2,1,5,-3};
kadan(number);
    }
}
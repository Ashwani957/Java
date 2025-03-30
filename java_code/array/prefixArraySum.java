import java.util.*; 
public class prefixArraySum{

    public static void SumOfSubArray( int array [])

    {

int currentSum = 0 ;
int maxsum=Integer.MIN_VALUE;

int prefix[]=new int [array.length];

prefix[0]=array[0];


for (int i =1 ; i<prefix.length ; i++)
{
    prefix[i]=prefix[i-1]+array[i];
    }



for (int i = 0 ; i<array.length ; i++)
{
    int start =1 ; 
    for (int j = i ; j<array.length ; j++)
    {
        int end = j ; 

        currentSum = start==0 ? prefix[end]:prefix[end]-prefix[start-1];


        if (maxsum<currentSum)
        {
            maxsum=currentSum;
        }
    }

}
    System.out.println ("max sum is :::::"+maxsum );

    }
    public static void main (String args[])
    {

int array[]={1,-2,6,-1,3};

SumOfSubArray(array);
    }
}
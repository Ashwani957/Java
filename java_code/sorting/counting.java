
import java.util.*; 
public class counting {

    public static void countingSort (int arr[])
    {
        int largest  =Integer.MIN_VALUE;
        for (int i = 0 ; i<arr.length; i++)
        {
            // it will store the largest value 
            largest= Math.max(largest, arr[i]);
        }

// we use largest+ 1 here so that our counting start form  0 to maximum length of the array 
        int count[]=    new  int [largest+1]; 

        for (int i =0 ; i<arr.length ; i++)
        {
            // here we iterate on the orginal array
            // here we treat count[arr[i]] as a index 
            count[arr[i]]++;
        }

        // sorting 

        int  j = 0 ; 
        for (int i = 0 ; i<count.length; i++)
        {
            while(count[i]>0)
            {
                arr[j]= i ; 
                j++; 
                count[i]--;     
            }
        }
        
            }

 

 
    public static void printarr(int arr[])
    {
        for (int i = 0 ; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }



public static void main (String args[])
{
int arr[]={5,4,1,3,2};
countingSort(arr);
printarr(arr);


}


}
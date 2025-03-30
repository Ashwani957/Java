// reversing a array without use of another array 


class Sixth {


public static  void swapInArray(int [] arr,int i , int j )
{
int temp; 
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
   

}

public static void   reverseArray(int[] arr)
{
    // Here we take two pointer first is i and second is j with the help of i and j we swap the value 

    int i = 0 , j=arr.length-1; 

    while (i<j)
    {

        swapInArray(arr,i,j);
        i++; 
        j--; 
        
    }

    
}

    public static void main (String[] args)
    {
 
int [] arr={1,2,3,4,5,3,2};
reverseArray(arr);

for (int i = 0 ; i<arr.length; i++)
 {
    System.out.print(arr[i]+ " " );
 }
    }
}
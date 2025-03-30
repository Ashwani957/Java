 public class merge{

    // creation of function are done here 
    public static void printArr(int arr[])
    {
        for (int i = 0 ; i<arr.length ; i++)
        {
            System.out.print (arr[i]+" ");
        }
        // System.out.println();
    }


    // main code are done here 

    public static void mergesort(int arr[],int si, int ei)
    {

        if (si>=ei)
        {
        return ; 
        }
// first we need to find the mid with the help of starting index and ending index 
    int mid = si+(ei-si)/2;
// for sorting left part we use recursion 
        mergesort(arr,si,mid);// left part 
        mergesort(arr,mid+1,ei);//right part 
        merge(arr,si,mid,ei);

    }

// this is used to merge the left and right array  so first we make a temperory array 
public  static void merge(int arr[],int si, int mid , int ei )
{
  //left  si(0,3)=4 right(4,6)=3   6-0+1=7
//  in the below instruction we use +1 because index start form zero 
     int temp[]=new int [ei-si+1];
     int i = si ;  //iterator for left part 
     int j = mid+1; // iterator for right side 
     int k = 0  ; // iterator for temperory array 
     while (i<=mid&& j<=ei)
     {
        if (arr[i]<arr[j])
        {
            temp[k]=arr[i];
            i++; k++;
        }
        else {
// when arr[i] is greater  than  arr[j] or a[j] is less than arr[i]

        temp[k]=arr[j];
        j++ ; k++ ; 
        }
     }
// left part 
while (i<=mid )
{
    temp[k++]=  arr[i++];
    }
    // right 
    while (j<=ei)
    {
        temp[k++]=arr[j++];

    }


// copy temp to original array 
for (k = 0, i = si ; k<temp.length ; k++, i++)
{
    
arr[i]=temp[k]; 
}
}

    public static void main (String args[])
    {
        int arr[]={6,3,9,5,2,8,-2};
        mergesort(arr,0,arr.length-1);  
        printArr(arr);

    }



 }
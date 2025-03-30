class Eight {
static void swap (int arr[],int i , int j )

{
int temp; 
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;


}
    static void reverse (int arr[] )
    {
        int i = 0 ; j=arr.length-1 ; 
        while(i<j)
        {
            swap(arr,i,j);
            i++;
            j--;

        }
    }

    static void rotateInplace(int arr[] , int k )
    {
        int n = arr.length; 
        k=k%n ; 
        reverse (arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8};
        rotateInplace(arr,4);
    }
}
// reverse a array without use of any other array

class Seventh{

    public static int [] rotate(int arr[] , int k )
    {
        int n = arr.length;
        k=k%n ; 
        int [] ans=new int[n];
        int j = 0 ; 
        for (int i =n-k; i<n; i++)
        {
            ans[j++]=arr[i];
        }

        for (int i = n-k; i<n; i++)
        {
            ans[j++]=arr[i];

        }

        return ans ; 
    }
    public static void main(String[] args)
    {

            int array[]={1,4,7,8,4,9};
            int newarray[]= rotate(array,1);

            for (int i = 0 ; i<newarray.length; i++)
            {
                 System.out.print(newarray[i]);
            }

    }
}
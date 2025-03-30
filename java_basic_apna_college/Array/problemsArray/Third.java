// find the unique number in a given array where al the elements are being repeatd twice with on value being unique 


class Third {

    public static int  unique (int arr[]){
        int n =arr.length; 
        for (int i = 0 ;i<n ; i++)
        {
            for (int j =  i+1; j<n ;j++)
            {
                if (arr[i]==arr[j])
                {

                    //if the element is present inside the 
                    arr[i]=-1; 
                    arr[j]=-1 ; 

                }
            }
        }
 
        int ans=-1; 
        for (int i = 0 ; i<n; i++)
        {
            if (arr[i]>0)
            {
                ans=arr[i];
            }
        }
        return ans ; 
  
    }
    
    public static void main(String[] args)
    {


int arr []={1,2,3,4,3,2,1};
 

    int result=unique(arr);
    System.out.print(result);
    }
}
 public class findarray {
    public static int check(int arr[],int key)
    {
        for (int i = 0 ; i<arr.length; i++)
        {

            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={1,4,5,3,2,6,};

        int key =5; 
      int result=  check(arr,key);
      System.out.println("element found at a index " + result);


       
           
        
       
    }
}

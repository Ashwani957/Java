// In array the sum of two number will be equal to the given number and if it is possible then return the number


class First {

    public static int pairsum(int [] arr, int target)

    {
            int ans = 0 ; 

            for (int i=0 ; i<arr.length; i++)
            {

                // we start Here j = i+1 because we do not move backward to check the same condition twice 
                for (int j = i+1 ; j<arr.length; j++)
                {
                    if(arr[i]+arr[j]==target)
                    {
                        ans++ ; 
                    }
                }
            }
            return ans ; 
    }
    public static void main(String[] args)
    {


        int arr []={5,2,44,55,33};
      int result=  pairsum(arr,7);
      System.out.println(result);
    }
}
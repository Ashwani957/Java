class numbergreaterthanGivenNumber{


public static void greaterNumber(int arr[],int number)

{
            int count= 0 ; 


        for (int i = 0 ; i<arr.length; i++)
        {
            if(number<arr[i])
            {
                count++;
            }
        }
        System.out.print(count);
}
    public static void main(String[] args)
    {
        int number=5;
            int arr[] ={4,6,33,22,1};
            greaterNumber(arr,number);

    }
}
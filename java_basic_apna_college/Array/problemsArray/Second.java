// count the number of triplets whose sum is equal to the given value x ;


import java.util.*; 
class Second{


public static int  tripleSum(int arr[],int target)
{
    int ans = 0 ; 

    for (int i = 0 ; i<arr.length; i++)
    {
        for (int j = i+1 ; j<arr.length; j++)
        {
            for (int k = j+1 ; k<arr.length; k++)
            {
                if (arr[i]+arr[j]+arr[k]==target)
                {
                    System.out.print("The sum of "+ arr[i] + " " + arr[j]+ " "+ arr[k]+ " is " + target);
                    ans++;
                }
                
            }
        }
    }
    System.out.println(" ");

    return ans ; 
}
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of the array");
    int size =sc.nextInt(); 
        int []arr=new int[size];
      
      System.out.println("Enter the element of the array");
      for (int i = 0 ; i<arr.length; i++)
      {
        System.out.print(" ");
        arr[i]=sc.nextInt();  
      }

System.out.println(" ");
System.out.println("Result is :");
      int result=tripleSum(arr,12);
      System.out.print(result );

// System.out.println(" ");
// System.out.println("value of the array");

//       for (int i = 0 ; i<arr.length; i++)
//       {
//         System.out.print(arr[i]);
//       }

    }
}
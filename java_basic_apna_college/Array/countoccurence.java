import java.util.*; 

public class countoccurence {


    public static void counterocurrence (int arr[] ,int occurence){
             int count=0 ; 
        for (int i = 0 ; i<arr.length; i++)
        {
            if (arr[i]==occurence)
            {
                // with the help of that we can caluclate the count value of the occurence
                // count++; 
               
                // with the help of that we can calculate the last occurence of the index 
               count=i ; 
            }
        }


        System.out.println("The occurence of" + occurence + "is" + count);
    }
        public static void main (String[] args)
        {

            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the size of array");
            int size =sc.nextInt(); 

            int [] array1 = new int[size];

            System.out.println("Enter the elements of array");
            for (int i = 0 ; i<=size-1 ; i++)
            {
                array1[i]=sc.nextInt();
            }

            System.out.println("print the element of the array ");

            for (int i = 0 ; i<=size-1 ;i++)
            {
                System.out.print(array1[i]+" ");
            }

            System.out.println(" ");
            counterocurrence(array1, 3);



        }
}

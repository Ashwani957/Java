import java.util.Arrays;

public class approach {
    public static void main(String args[])
    {


//        Imperative approach : step by step approach to solve any problem
        int arr[]={1,2,3,4,5,6};
        int sum = 0 ;
        for(int i = 0 ; i<arr.length; i++) {
            if (arr[i] % 2 == 0){
                sum+=arr[i];
        }

        }
        System.out.println(sum);

//        Declarative approach : In Declarative approach we only focus on result do not focus on step
        int arr2[]={1,2,3,4,5};
//
      int sum2=Arrays.stream(arr2) // convert the array to the intstream
              .filter(n->n%2==0)//filter the value on the basis of the condition
              .sum();// it will sum the filter value
      System.out.println(sum2);



    }
}

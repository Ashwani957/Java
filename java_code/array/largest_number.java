import java.util.*;

public class largest_number{

public static int largest( int list[]){
    int largest = Integer.MIN_VALUE;//-infinity
    int smallest =Integer.MAX_VALUE;

    for (int i=0 ;i<list.length;i++)
    {
        if (largest<list[i]){
            largest=list[i];
        }

        if(smallest>list[i])
        {
            smallest=list[i];
        }


    }

    System.out.println("smallest number is :::"+smallest);
return largest ; 

}



    public static void main (String args[])
    {
int list []={1,4,3,7,8,5,9};
System.out.println(list.length-1);


System.out.println("largest number is :::::"+largest(list));
    }
}
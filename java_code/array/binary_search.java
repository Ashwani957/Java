public class binary_search {

    public static int binary_search (int number[],int key )

    {
        int start =0 ;
        int end=number.length-1;


        while (start<=end)
        {
            int mid = (start+end)/2;


            if (number[mid]==key)
            {
                return mid ; 
            }

            if (number[mid]<key )
            {
                // this is for rigth section 
                start=mid+1; 
            }
            else{
                //left side 
                end=mid-1 ; 
            }
        }

        return  -1 ; 
    }


    public static void main (String args[])
    {

int number[]={2,5,7,9,10,12,14,16,18,20};
int key = 1 ; 

System.out.println ("return index is :::"+binary_search(number,key));



    }
}
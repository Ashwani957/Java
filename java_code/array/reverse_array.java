public class reverse_array{

public static void reverse(int array[])
{
int first= 0 ; int last =array.length-1; 

while (first <last )
{
    //swap 
    int temp ; 

    temp=array[last];
    array[last]=array[first];
    array[first]=temp ; 
    first++; 
    last--;     
}




}

    public static void main (String args[])
    {
int array[]={12,34,56,78,90};

reverse(array); 
System.out.println("Reverse array is :::");

for (int i = 0 ; i<array.length ; i++)
{
System.out.print(+array[i]+" ");
}
    }
}
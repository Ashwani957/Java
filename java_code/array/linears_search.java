public class linears_search{

public static int linerSearch(int number[],int key )
{
    for (int i= 0 ; i<number.length ; i++)
    {
        if (number[i]==key)
        {
            return i ; 
        }
    }
    return -1; 
}

    public static void main (String args[])
    {

int number[]= {1,23,4,54,34,64,54};
int key = 4; 
int index = linerSearch(number, key );
if (index==-1)
{
    System.out.println ("key not found:::::");
    System.out.print(key);

    }

    else{
        System.out.println("key found at :::"+index);
    }
}
}
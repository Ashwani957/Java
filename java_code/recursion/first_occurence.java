public class first_occurence {
    public static int indexreturn(int number[] , int key ,int i )
    {
if (i==number.length){
    return -1 ; 
    
}
if (number[i]==key)
{
    return i;
}

    return indexreturn(number,key,i+1);


    }



    // last occurence 
    public static int lastoccurence (int number[],int key , int i )
    {
        if (i==number.length)
        {
            return -1 ; 
        }
int isfound =lastoccurence(number, key, i+1);
if(isfound==-1 && number[i]==key)
{
    return i ; 
}
return isfound; 

    }
    public static void main (String args[])
    {
int array[]={1,2,3,4,5,5};
// System.out.println(indexreturn(array,5,0 ));
System.out.println(lastoccurence (array,5,0 ));


    }
}
 
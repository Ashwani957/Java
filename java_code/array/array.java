public class array{

public static void change (int marks[])
{

    for (int i = 0 ; i<marks.length ; i++)
    {
        marks[i]=marks[i]+1 ;
    }

}
    public static void main (String args[])
    { 
    //  creation of array   
int number[]={50, 69,62,42};
change(number);
 for (int i= 0 ; i<number.length ; i++)
 {
    System.out.println("number is :::::"+number[i]);
 }
}
}
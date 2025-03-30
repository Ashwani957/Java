


// our array will work with a pass by reference 
public class array1 {

    public static void  update (int marks1[])
    {
        for (int i = 0 ; i<marks1.length; i++)
        {
            marks1[i]=marks1[i]+1; 
        }
       
    }
    public static void main (String args[])
    {
        // declaration of the array 
// 
        // int marks []=new int [50];
        int marks1 []={10,20,30,40,50};

        for (int i = 0 ; i<marks1.length; i++)
        {
            System.out.print(marks1[i] +" ");
        }

         

    }
    
}

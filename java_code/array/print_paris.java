public class print_paris{

    public static void printParis(int array[]){

int total_pairs= 0 ; 
        for (int i = 0 ; i<array.length ; i++)
        {
            int current = array[i];//it store the first word of the string 
    for (int j=i+1 ; j<array.length; j++)
    {
            System.out.print("("+current+","+array[j]+")");
            total_pairs++; 
    }

    System.out.println ();

        }
         System.out.print("total pairs = "+total_pairs);

    }
    public static void main (String args[])
    {
        
        int array[] ={1,2,5,8,9,5,3}; 
        printParis(array);
    }
}
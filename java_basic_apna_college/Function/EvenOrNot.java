public class EvenOrNot {

    public static boolean evenOrNot(int number) {

        if(number%2==0)
        {
            return true; 
            
        }
        return false; 

    }

    public static void main (String args[])
    {
        boolean result =evenOrNot (21);
        System.out.println(result);
    }
}

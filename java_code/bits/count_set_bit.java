public class count_set_bit{

    public static int countsetbit(int number)
    {
            int count = 0 ; 
            while(number>0 )
            {
                if((number&1)!=0)
                {
                    // ls
                    count++;

                }
                number=number>>1;
            }
            return count; 
    }
    public static void main (String args[])
    {
        System.out.println(countsetbit(7    ));

    }
}
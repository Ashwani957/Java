public  class fastexpontential {

    public static int fastexpontentials(int a , int number)
    {
        int ans= 1; 
        while (number>0)
        {
            if ((number & 1) != 0 )
            {
                ans = ans * a ;
                }

            a=a*a ; 
            number=number>>1 ; 
                    }

                    return ans ;  
    }
    public static void main (String args[])
{
System.out.println (fastexpontentials(3,5));


}
}
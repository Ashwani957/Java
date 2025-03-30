public class clearith{

    public static int clearithbits(int number,  int i )
    {
        int bitsmask=(~0)<<i;

        return number & bitsmask ;     
    }
    public static void main (String args[])
    {
        System.out.println(clearithbits(15,2));


    }
}
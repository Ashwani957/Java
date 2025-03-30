public class decreasing {
    public static void  print_decrease(int number){
        // base case
        if(number==1)
        {
            System.out.println(number);
        return ; 
        }
        System.out.print(number+" ");
        print_decrease(number-1);

   
    
    }
    public static void main (String args[])
    {
int n = 10 ; 
print_decrease (n);
    }

}
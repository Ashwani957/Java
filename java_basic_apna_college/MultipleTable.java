

import java.util.Scanner ; 
public class MultipleTable {
    public  static void main (String[] args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number");
        int StartTable=sc.nextInt(); 
        int endTable=sc.nextInt(); 

        for (int i = StartTable; i<=endTable;i++)
        {
            
            for (int j = 1 ; j<=10; j++)
            {
                System.out.println(i+"*"+j+"="+i*j);
              
            }
            System.out.println(); 
        }

    }
}

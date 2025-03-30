 

public class first {

    
    public static void main (String args[])
    {

            int [][] twodimensonalarray=new int[4][4];
            twodimensonalarray[0][0]=1; 
            twodimensonalarray[0][1]=2;
            twodimensonalarray[0][2]=3;
            twodimensonalarray[1][0]=4;
            twodimensonalarray[1][1]=5;
            twodimensonalarray[1][2]=6;
            twodimensonalarray[2][0]=7;
            twodimensonalarray[2][1]=8;
            twodimensonalarray[2][2]=9;
            twodimensonalarray[3][0]=10;
            twodimensonalarray[3][1]=11;
            twodimensonalarray[3][2]=12;
            twodimensonalarray[0][3]=13;
        
// System.out.print(twodimensonalarray.length);
            // System.out.println(twodimensonalarray[0][0]);
            // System.out.println(twodimensonalarray[0][1]);


            // for(int i = 0 ; i<=twodimensonalarray.length; i++)
            // {
            //     for (int j = 0 ; j<=twodimensonalarray.length; j++)
            //     {
            //         System.out.println(twodimensonalarray[i][j]);
            //     }
            // }
            
            for(int i = 0 ; i<twodimensonalarray.length; i++)
            {
                for (int j = 0 ; j<twodimensonalarray.length; j++)
                {
                    System.out.println(twodimensonalarray[i][j]);
                }
            }
    }
}

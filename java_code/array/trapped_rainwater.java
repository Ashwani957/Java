public class trapped_rainwater{

public static int rainwater(int height[])
{

    //calculate the left boundary 
    int leftMax[]=new int[height.length];
    // this means that the leftmax is equal to height first element 
    leftMax[0]=height[0];
for(int i = 1; i<height.length ; i++)
{
    // this will compare the left boundary with the current height 
    leftMax[i]=Math.max(height[i],leftMax[i-1]);
}
    // calculate the  right boundary 
    int rightMax[]=new int (height.length);
    // the height of first is already book 
        rightMax[height.length-1]=height[height.length-1];
        for (int i=height.length-2; i>=0  ; i++)
        {
            rightMax[i]=Math.max(height[i]-height[i+1]);
        }

    int trappedwater= 0 ; 



    // loop run 
for (int i = 0 ; i<height.length ; i++)
{
//water level = min (leftmax boundery , right boundery )
    int waterlevel=Math.min(leftMax[i],rightMax[i]);
// trapped water = waterlevel-height[i];    
    trappedwater+=waterlevel-height[i];
}



return trappedwater;
}


    public static void main (String args[])
    {

int height[]={4,2,0,6,3,2,5};
System.out.println (rainwater(height));


    }
}
public class shortest_path{


public static float getshortestpath(String path)
{
    int x= 0  , y = 0 ; 
    for (int i = 0 ; i<path.length();i++)
    {

        char dir=path.charAt(i);
        // south 
        if (dir=='s')
        {
            y--; 
        }
        // north
        else if (dir=='N')
        {
            y++; 
        }

        // west 
        else if (dir=='W')
        {
            x--; 

        }
// East
    else {
        x++; 
    }
    }
// shoretest distance formula 

// x2+y2; 
    int x2=x*x; 
    int y2=y*y; 
    return (float)Math.sqrt(x2+y2);
}


    public static void main (String args[])
    {
// String path="WNEENESENNN";  
String path="NS";  


System.out.println(getshortestpath(path));
    }
}
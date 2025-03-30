public class stringcompression{

    public static String compression (String str)
    {
        String newstr="";
        for (int i = 0 ; i<str.length();i++)
        {
            // aaaabbcccdd
             Integer count = 1; 
            
             while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1) )
             {
                count++; 
                i++; 
             }
            //  convert integer to string
            // the last similar charcter doesnot match to the next character then here we store that character 

           newstr+= str.charAt(i);
           if (count>1)
           {
            newstr+=count.toString();
           }
        }
return newstr; 
    }


    public static void main (String args[])
    {
        String str="aaaabbcccdd";
        System.out.println(compression(str));

    }
}
public class charat{


    public static void printletter (String  str)

    {
for (int i = 0 ; i<str.length();i++)
{
    System.out.println (str.charAt(i));
}




    }
    public static void main (String args[])
    {

String firstname = "ashwani";
        String lastname="maury";
        String fullname= firstname+" "+ lastname;
        // charAt it will print the string at that particular index 
        // System.out.println (fullname.charAt(0));
        printletter(fullname);


    }
}
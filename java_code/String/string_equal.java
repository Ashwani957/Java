public class string_equal{

    
    public static void main (String args[])
    {
String s1="Tony";
String s2="Tony";
String s3=new String ("Tony");
// here string are s1 and s2 point to the same tony but s3 point to the another tony

// if (s1==s2)
// {
//     System.out.println("String are equal");
    
// }
// else {
//     System.out.println("string are not equal");
// }

// if (s1==s3)
// {
//     System.out.println("string are equal");

// }
// else {
//     System.out.println("string are not equal ");
// }//  equals are used to check the strings is equal or not
if (s1.equals(s3))
{

    System.out.println("string are  equal ");
}
else {
    System.out.println("string are not equal ");
}
    }
}
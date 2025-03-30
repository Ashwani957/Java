public class sub_string{


public static String substring(String str ,int startindex, int endindex)

{
    String newstring= "";

for (int i =startindex ; i<endindex; i++)
{
    newstring+=str.charAt(i);
}
return newstring;

}
public static void main (String args[])
{
String name= "ashwani";
 String result=substring(name,0 , 4);
 System.out.println(result);
//  inbuild sub-string function 
// here substring is a inbuild function  
System.out.println (name.substring(0,4));

}



}
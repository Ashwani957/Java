package learn;

import java.util.Enumeration;
import java.util.Vector;

public class VectorList
{
    public static void main(String args[]){

        Vector<String> vector=new Vector<>();
        vector.add("ashwani");
        vector.add("karan");
        vector.add("suman");
        vector.add("pawan");
        System.out.println("vector are :"+vector);
        vector.remove("ashwnai");
     System.out.println(vector.size())   ;
     System.out.println(vector.contains("ashwani"));
     System.out.println(vector.get(0));
//     clear() are used to clear all the element in the vector

// vector.clear();
 System.out.println(vector);

 System.out.println("Enumeration method ");
//        get the enumeration to traverse the vector
//        in eumeration
//        it is a cursor or pointer

        Enumeration<String> en=vector.elements();

//        Iterate using Enumeration
        while(en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }


    }
}

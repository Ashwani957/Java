package learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {
    public static void main(String args[])
    {

        ArrayList<String> name =new ArrayList<>();
        name.add("ashwani");
        name.add("karan");
        name.add("suman");
//        it will add an element at particualr index
        name.add(1,"sahil");

/*
Arraylist are iterator in three way  for-each()
 */

        for(String s:name){
            System.out.println(s);
            StringBuffer br=new StringBuffer(s);
            System.out.println(br.reverse());
        }

        System.out.println("__________________________________________________");

        /*
        Traversing with the help of iterator
         */

//        Here we store the object of the Iterator in itr
        System.out.println("Iterator ");
//        forward traversion
        Iterator<String> itr =name.iterator();

        while(itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }
//        backward traversing of collection are done by the listIterator


        System.out.println("+++++++++++++++++++++");
//        when we want to traverse in previous direction then we pass the size()
        ListIterator<String> listItr=name.listIterator(name.size());

//        ListIterator have one method that traverse the element in the previous direction

        while(listItr.hasNext())
        {
           String prev= listItr.previous();
           System.out.println(prev);

        }

        System.out.println("++++++++++++ForEach +++++++++++++");

//        For Each method in  which we pass the lambda function
        name.forEach(e->{
            System.out.println(e);
        });

System.out.println("+++++++++++++TreeSet+++++++++++++");
TreeSet<String> tr=new TreeSet<>();
tr.addAll(name);
System.out.println(name);

//sorting order
tr.forEach(e->{
    System.out.println(e);
});



    }
}

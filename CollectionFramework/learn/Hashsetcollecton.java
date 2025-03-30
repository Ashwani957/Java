package learn;

import java.util.HashSet;

public class Hashsetcollecton {

    public static void main(String args[]){

        /*
       Hashset are used to store the unique value
       Order are not manintain in it


         */
//        if we want to provide the intial capacity of the hashset then we provide like this

        HashSet<Double> hs=new HashSet<>(23);
        hs.add(12.34);
        hs.add(22.34);
        hs.add(56.34);
        hs.add(78.89);
        System.out.println(hs);
        hs.remove(12.34);
        System.out.println(hs);
        System.out.println(hs.size());
       System.out.println( hs.contains(56.34));
      System.out.println(hs.getClass());


//      toArray will convert the Hashset into an array
      System.out.println(hs.toArray());
        hs.clear();
        System.out.println(hs);
        System.out.println(hs.isEmpty());

    }
}

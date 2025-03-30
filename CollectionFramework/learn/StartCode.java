package learn;

import java.util.*; // it import all the classes of the util package

public class StartCode {

    public static void main(String args[])
    {

        /*
        createion collection are two way
        1.type safe collection : same type of element are added to collection
        2.untype safe collection : different type of element are added to the collection

         */

//        type safe collection createion

        ArrayList<String> name =new ArrayList<>();
//        Collections.addAll()
//        Collection //

        name.add("ashwani");

        name.add("karan");
        name.add("suman");

//        it will add an element at particualr index
       name.add(1,"sahil");
//       .get(index)--> this method are used to get the element at particular index
        System.out.println(name.get(0));

//        set(int index , element) --> it is used to update the value at particular index
        name.set(0,"pawan");
        System.out.println("The arraylist will be :"+name);
//        remove(int index)--> it is used to remove the element at particular index
        name.remove(1);
    System.out.println("remove element at index"+name);

//size()--> it return the size of the list
        System.out.println("size of list:"+ name.size());
//clear ()--> it is used to clear the all element in the list
//       name.clear();
//       System.out.println("list after clear"+name);
//        contain method in arraylist is used to check whether the element exist in the array or not
//        it always return the true value
      System.out.println(name.contains("suman"));

//      indexof () return the index of element

        System.out.println(name.indexOf("suman"));

//       name.add(1);// this will shown an error because
//        untype safe collection creation






    }
}


/*
Methods of arraylist

.get(index)----> it will return the element that is present at particular index
 */

package learn;

import java.util.HashMap;
import java.util.Map;

public class MapExample {


    public static void main(String args[]){

        HashMap<String,Integer> course=new HashMap<String, Integer>();

//        adding an element in the map
//        order of key are not preseved
        // duplicaton of key are not allowed but the value will be duplicate
        // it store the value in the form of object
        course.put("Core Java",12000);
        course.put("Full Stack ",50000);
        course.put("Spring",8000);
        course.put("Android",60000);
        course.put("Python developer",60000);

        System.out.println(course);

//        method of the map
//get("key name") : //return the value of particular key

        System.out.println(course.get("Spring"));
//        containsKey(k key ) //    check if the key is present or not if present then return true other wise false
        System.out.println(course.containsKey("Spring"));
//  containsValue(v value) check if the value exists in the map
        System.out.println(course.containsValue(60000));

        System.out.println("remove elements");
//        remove will remove the key and value both from the hashmap
//        remove(k key , value)
//        clear() it will clear all the list
        System.out.println(course.remove("Core Java"));

        System.out.println(course);


       System.out.println("Iterator over the map ") ;

//       Iterator over the map using the keySet()
//        keySet() will return all the keys
       for(String key:course.keySet())
       {

           System.out.println(key +"->"+ course.get(key));
       }

//       Another method

        System.out.println("Iterator Using entryset()");


//       entry set return the key value pair
       for(Map.Entry<String,Integer> entry:course.entrySet())
       {
//           Here we can get the key along with value
    System.out.println(entry.getKey()+"->"+entry.getValue());
       }


       System.out.println("For Each Loop come in java 8");

       course.forEach((key,value)->{
           System.out.println(key+" ->"+value);
       });
    }

}

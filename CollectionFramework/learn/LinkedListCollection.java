package learn;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListCollection {
    public static void main(String args[]){
         LinkedList<String> ll=new LinkedList<>();
         ll.add("apple");
         ll.add("banana");
         ll.add("orange");
         ll.add("milk");
         System.out.println(ll);
         ll.remove("orange");
        System.out.println(ll);
        System.out.println(ll.size());

        System.out.println(ll.get(0));
        ll.clear();
        System.out.println(ll);
    ll.contains("apple");
    System.out.println("Stack");
    Stack<Integer> s=new Stack<>();
    s.add(1);
    s.add(2);
System.out.println(s);

    }
}

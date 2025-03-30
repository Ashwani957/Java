import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class CreationStream {

    public static void main(String args[])
    {
// we cannot me the object of the interface so that we make the object of the classes
        List<String> ls=new ArrayList<>();
        ls.add("apple");
        ls.add("banana");
        ls.add("cherry");
        System.out.println(ls);

//        convert the arraylist into stream

        Stream<String> stream=ls.stream();

//        convert the array into the stream
        String [] array={"ashwani","bananan","cherry"};

       Stream<String> streams= Arrays.stream(array);

//          we can create our own stream
       Stream<Integer> integerStream= Stream.of(1,2,3);

//       another way to create the Stream
        //In stream.iterate we can  give the starting value from where we start it and second one  is a lamabda function
       Stream<Integer> s= Stream.iterate(0,n->n+1).limit(100);

//       Here we generate the stream with the help of the supplier
        Stream<Integer>limit=Stream.generate(()->(int)Math.random()*100).limit(15);


//        Stream operation







    }
}


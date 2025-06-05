import java.util.Arrays;
import java.util.List;

public class StreamOperation2 {
    public static void main(String[] args) {

//        max will return the last value does not matter it will be smaller or bigger
//            Integer integer= Stream.iterate(0,n->n+1).limit(101).map(x->x/10).distinct().peek(System.out::println).max((a,b)->b-a).get();
//        System.out.println(integer);

//        Long dbl =Stream.iterate(0,n->n+1).limit(100).count();
//        System.out.println(dbl);
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.parallelStream();
    }
}

/*
Terminal operation in stream like count , max , min 
 */

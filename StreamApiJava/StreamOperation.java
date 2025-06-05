import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamOperation {
    public static void main(String args[])
    {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9,2,4);
        System.out.println(list);
//        first convert the collection into stream
//        in filter we use the lambda expression
//        Here we collect the filter value in the lis
//        Here we store the result in the filter
  List<Integer> filterList=   list.stream().filter(n->n%2==0).collect(Collectors.toList());
 ;
//  map  System.out.println("Print the filter List :"+filterList)method it will reduce the answer
//List<Integer> mapList =filterList.stream().map(n->n/2).collect(Collectors.toList());
//       [2, 4, 6, 8, 2, 4]
//        if we want ki Humera output sorted order me aye tab hum use krete h sorted() are used for sorting purpose
//        this will proudced the output as ascending order
//List<Integer> mapList =filterList.stream().map(n->n/2).distinct().sorted().collect(Collectors.toList());

//        know Here we sort the order on the basis of descending order with the help of comparatable logic
//
List<Integer> mapList1 =filterList.stream().map(n->n/2).distinct().sorted((a,b)->(b-a)).collect(Collectors.toList());


System.out.println(mapList1);
// if we want to skip the element in the result then we will do like this
List<Integer> mapList2 =filterList.stream().map(n->n/2).distinct().sorted((a,b)->(b-a)).skip(1).collect(Collectors.toList());
System.out.println(mapList2);
List<Integer>list2=Stream.iterate(0,n->n+1).limit(101).skip(1).peek(x->System.out.println(x)).collect(Collectors.toList());
System.out.println(list2);



    }
}

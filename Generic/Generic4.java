
import java.util.ArrayList;
public class Generic4 {
 

    // when we want to return something then we use the generic type 
// public <T> void copy (ArrayList<T> source, ArrayList<T> destination ){
//     return  list.get(0);
// }

// when we do not want to return somethign then we use wildcard 


public void   copy (ArrayList<?> source ){
for(Object o:list){
    System.out.println(o);
}

}


    public static void main(String args[]){

    }
}

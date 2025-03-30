
import java.util.ArrayList;
public class Generic1{
    public static void main(String args[])
    {

        // when we do not use generic then we will add any kind of value in it this cause a problem while we try to assing the value of particular index to something 
        // we face an problem like typecasting that will cause an error 
        // ArrayList list = new ArrayList();
        // list.add("a");
        // list.add(1);
        // list.add("b");
        // System.out.println(list);


        // To solve this issues java introudce the generic in java5 

        ArrayList<String> sr=new ArrayList<>();

        // sr.add(1);// now this will cause an error in it because we use generic to that is string 

    }
}
package learn;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapCollection
{
    public static void main(String[] args) {
        Map<String, Integer> stuinfo=new LinkedHashMap<>();
        stuinfo.put("RollNo",211024);
        stuinfo.put("fees",120000);
        stuinfo.put("Pincode",210245);
        System.out.println(stuinfo);
    System.out.println(stuinfo.containsKey("RollNo"));
    System.out.println(stuinfo.containsValue(211024));
//        keyset
System.out.println("keyset");
        for(String key : stuinfo.keySet()){
            System.out.println(key+"->"+stuinfo.get(key));
        }


        System.out.println("Entryset()");
        for(Map.Entry<String,Integer> entry: stuinfo.entrySet()){
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }


//        for EAch loop  using lambda  function

        System.out.println("+++++++++++++Lambda function ++++++++++++++");
        stuinfo.forEach((key,value)->{
            System.out.println(key+"-->"+value);
        });



    }
}

package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployee {
    public static void main(String args[])
    {
        ArrayList<Emp> emp=new ArrayList<>();
        emp.add(new Emp("ashwani","12345678", 2));
        emp.add(new Emp("karan","9569093205", 5));
        emp.add(new Emp("pankaj","1289064", 4));

        System.out.println(emp);
//             this willl show an erro ki kise base par compare kru
//             Collections.sort(emp); // this is for Comparable
        Collections.sort(emp,new IdCompartor()); //  this is for the comparator in which we pass the second argument as the object of the idcompartor
              System.out.println("running");
//              comparable
        System.out.println(emp);


        ArrayList<Emp>emps1=new ArrayList<>();
        emps1.addAll(emp);
        System.out.println(emps1);
        Collections.sort(emps1,new NameCompartor());
        System.out.println(emps1);
    }
}


/*
IN comaparable we can sort on the basis of only one creteria
 */
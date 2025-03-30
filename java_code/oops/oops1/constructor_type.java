public class constructor_type {
    public static void  main (String args[])
{
Students s1 = new Students();
Students s2  = new Students ("ashwani maurya");
System.out.println (s2.name);

Students s3 = new Students (123456890);
System.out.println(s3.roll);
}
}

class Students{
    String name; 
    int roll ; 
    int phone  ; 
    


    Students()
    {
System.out.println ("Constructor is called ");
    }

    Students(String name )
    {
    this.name= name ; 
    }

    Students(int roll)
    {
        this.roll =roll ; 
    }
 
 Students(String name , int roll , int phone)
 {
    this.name = name ; 
    this.roll = roll  ;
     this . phone = phone ; 
 }


}


// when we use multiple constructor with different parameter is know as constuctor overloading 
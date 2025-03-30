public class statics {
    public static void main (String args[])
    {
        Students s1 = new Students();
        s1.schoolname="saini international school";
        Students s2 = new Students ();
        s2.schoolname="jukfdf";
        Students s3 = new Students();
        // s3.schoolname=
        // this value will 
        System.out.println(s1.schoolname);


    }


}

class Students {
    String name ; 
    int roll ; 
    static String schoolname ; 

    void setname (String name )
    {
        this.name = name ; 

    }

    String getname ()
    {
return this.name ; 
    }
}
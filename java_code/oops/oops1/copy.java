public class copy{
public static void main (String args[])
{
Students s1 = new Students();

s1.name = "ashwani ";
s1.roll=12345;
s1.password = "asdhfsadfhdff";
// creation of second object 
// we can declare a marks HERE
s1.marks[0]= 100 ; 
s1.marks [1]=90; 
s1.marks[2]=80 ; 

Students s2 = new Students(s1);
s2.password="awsdk"; 


for (int i = 0 ; i<3 ; i ++)
{
    System.out.println (s2.marks[i]);
}

}


}

class Students {
    String name ; 
    int roll ; 
    String password ; 
    int marks[] ; 


// copy constructor 
// in copy constructor we take s1 object as parameter 
Students(Students s1)
{
    marks =new int[3];
    this.name = s1.name ; 
    this . roll = s1.roll ;
    this.marks = s1.marks;
}


Students()
{    
    marks =new int[3];
    System.out.println ("constructor is called");

}


Students(String name )
{
    marks =new int[3];

    this.name = name ; 
    
}


Students(int roll)
{
    marks =new int[3];

this .roll  =roll ; 

}




}
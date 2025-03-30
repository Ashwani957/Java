public  class copy2{
    public static void main (String args[])
    
    {
Students s1=new Students();
s1.name= "ashwani";

s1.roll = 1234567788; 

System.out.println (s1.name);
System.out.println (s1.roll);
s1.marks[0]=12; 
s1.marks[1]=23 ; 
s1.marks[2]=1334 ;
// here we change the value of s1 marks at index 2 ; 

Students s2 = new Students (s1);

s1.marks[2]=11111;

for (int i = 0 ; i< 3 ; i++)
{
    System.out.println (s2.marks[i]);
}

    }
}


class Students {
    String name ; 
    int roll ; 
    int marks[];


// students s2  copy constructor is created 
//  sallow means when we change in s1 then s2 changes will also reflected

// Students (Students s1)
// {
//     marks=new int[3];
//     this.name = s1.name ;
//     this.roll = s1.roll ; 
//     this.marks = s1.marks ; 
// }

// deep 


Students (Students s1)
{    marks=new int[3];
    this.name = s1.name ;
    this.roll = s1.roll ; 
    this.marks = s1.marks ; 

    for (int i=0  ; i<3 ; i++)
    {
        this.marks[i]=s1.marks[i];
    }
}


    Students ()
    {
        marks=new int [3];
        System.out.println ("called constructor "); 

    }
    
    Students (int roll )
    {
        marks = new int [3];
        this.roll = roll ; 

    }
    Students (String name)
    {
        marks = new int [3];
        this.name = name ; 
    }




     
}
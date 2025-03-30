
// second method of object initilization 


class animal{
    String name ; 
    String color; 
    int age ; 



    void assign(String n , String c , int a )
    {
        name = n ; 
        color=c ; 
        age = a ; 
    }

    void display (){
        System.out.println("The specification of the dog is :::" + name + " " +" "+ color + " " +age );
    }

}


public class OopsThree {

    public static void main (String args[])
    {

        animal an=new animal(); 
        an.assign("karan","white" ,12 );
an.display();

    }
    
}

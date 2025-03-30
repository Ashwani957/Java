class Employee {

    String name ; 
    int emp_id ; 
    int age ; 

    public Employee(String name , int emp_id , int age ) {
        this.name =name ; 
        this.emp_id=emp_id;
        this.age=age ; 

    }

    public  void EmployeeDisplay()
    {
      System.out.println("The Details of the Employee is ::");
      System.out.println("The name of the Employee:"+name);
      System.out.println("The emp_id of the Employee ::"+emp_id);
      System.out.println("The age of the employee is ::"+age);
    }

    

}



public class ConstructorTwo {
    
public static void main (String ...args)
{
    Employee e1=new Employee("ashwani",12, 25);
    Employee e2=new Employee("karan",13, 26 );
    Employee e3=new Employee("karan",13, 26 );
    Employee e4=new Employee("karan",13, 26 );

    e1.EmployeeDisplay();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();


    System.out.println("The details of the second Employee is ::");
    e2.EmployeeDisplay();
}
}

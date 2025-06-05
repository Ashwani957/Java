abstract class Employee {
    // encapsulation 
    private String name;

    Employee(String name){
        this.name=name;
    }
    public void setname(String name){
        this.name=name;
    }
    public   String getname(){
        return name; 
    }
    // abstract method 
    abstract void work();
    void displaydetails(){
        System.out.println("Employee Name:"+this.name);
    }
    // Inheritance 

    class FullTimeEmployee extends Employee{
            private int salary;

            public FullTimeEmployee(String name,int salary){
                super(name);
                this.salary=salary;
            }

            @Override
            void work(){
                System.out.println("Full time employee work 9 hours daily");
            }

    }


    public static void main(String[] args) {
        //upcasting 
        Employee emp=new FullTimeEmployee();
        emp.displaydetails();
        emp.work();
        // Downcasting  
    }

}
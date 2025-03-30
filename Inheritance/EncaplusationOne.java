class Employee{
    private int emp_id ; // data hiding 

    // setter are used to set the data 
        public void setEmp_id (int eid)
        {
            this.emp_id=eid ; 
        }

        // getter method are used to get the value of the private variable and methods 

        public  int  getEmp_id ()
        {
            return emp_id; 
        }


}

public class EncaplusationOne {
    public static void main(String[] args) {
        Employee e1 = new Employee() ; 
        e1.setEmp_id(12);
        System.out.println("The employee id is :::::"+e1.getEmp_id());
    }
}

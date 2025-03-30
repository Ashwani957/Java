
class employee {
    int emp_id ; //instance variable 

    void setEmp_id (int emp_id)
    {
        //  if the instance variable name or local   variable name is same then we did not able to set the value of the globla varibale and we get a output as zero (0) 
        // this.emp_id refere to the instance varibale and emp_id refere to the local variable 
        this.emp_id=emp_id; 

    }

    void getEmp_id()
    {
        System.out.println("Emp id is :"+emp_id);
    }
}


public class Confilicts{


    public static void main(String ...args){
            employee e1 =new employee(); 
            e1.setEmp_id(10);
            e1.getEmp_id();
    }
}

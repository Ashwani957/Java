public class modifiers{
    public static void main (String args[])
    {
    bankaccount b=new bankaccount();
b.username="ashwani";
// we can not set the password because password is a private member 
// b.password=2322322; 
System.out.println (b.username );
b.setpassword (1234567788);
// we also cannot do that because password has private in class
System.out.println (b.password);

    }
}

// if we declare  attributes a public then we can change from outside 
// if we declare attributes as private then we cannot change from outside 
//  if we want to give a value to the private member then we give with the help of another function 
class bankaccount{
  public String username ; 
    private int password ; 

    public void setpassword(int  pass)
    {
        password=pass; 
    }
    
}
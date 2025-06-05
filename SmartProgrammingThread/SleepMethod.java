




public class SleepMethod {

    public static void main(String args[])
    {
        for(int i = 0 ; i<1000;i++)
        {

            try{
            Thread.sleep(1000);

            }
            catch(Exception e ){
          System.out.println("Something want wrong ");
            }
            System.out.println("i:"+i);
        }
    }
}

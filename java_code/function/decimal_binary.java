public  class decimal_binary {
    public static void decimal_converte(int number)

    {
int myNum= number;
int pow = 0 ; 
int binNum =  0 ; 
while (number>0)
{
    int rem =number%2;
    binNum=binNum +(rem*(int)Math.pow(10,pow));
    pow++;
    number=number/2;

}

System.out.println("binary form of"+myNum+" ="+binNum);
    }


    public static void main (String args[])
    {
decimal_converte(7);

    }
}
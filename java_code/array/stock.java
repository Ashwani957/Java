public class stock{

public static int stock_price(int price_list[])
{// here we set the buyprice to the maximum price that is infinity 
    int buyprice=Integer.MAX_VALUE;
    int maxprofit= 0; 

    for (int i=0; i<price_list.length ; i++)
    {
        if (buyprice<price_list[i])

        {
// profit section we can get a  profit 
        int profit =price_list[i]-buyprice;  // price for one day 

    maxprofit=Math.max(maxprofit,profit);
        }
        // if the stock price is less than the current buying price then we need to buy the stock 
        else {
            buyprice=price_list[i];
        }
    }
    return maxprofit;
}




public static void main (String args[])

{
int prices[]={7,1,5,3,6,4};
System.out.println(stock_price(prices));
}
}
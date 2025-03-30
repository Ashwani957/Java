class checkSortedOrnot{

    public static void check(int arr[])
    {    boolean checked=true; 
        for (int i=1 ; i<arr.length ; i++)
        {

            if(arr[i-1]<arr[i])
            {
                    checked=true; 
            }
            else {
                checked=false ; 

            }

        }
        System.out.println("checked result" + " " + checked);
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        check(arr);
    }
}
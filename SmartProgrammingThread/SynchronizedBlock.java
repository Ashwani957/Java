
//Synchronzied method



class RailTickets  {

    int total_seats=50;

   // synchornized Block are used when we want to synchorozniced only particular block
     void book_ticket (int seats ) {

         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         // synchronized will be used when we want to synchornized a particualr block of code
         synchronized( this)
         {
             if(total_seats>=seats)
             {
                 System.out.println(seats +" "+"Seats Book Succesfully");
                 total_seats=total_seats-seats;
                 System.out.println("TotalSeats Lefts : "+ total_seats);
             }

             else {
                 System.out.println("Cannot Book A seats ! UnAvailable ");
             }
         }
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());





    }
}
public class SynchronizedBlock extends Thread
{
    static  RailTickets rail ;

    int seats ;
     public  void run() {
        rail.book_ticket(seats);

    }


    public static void main(String[] args) {
        rail=new RailTickets();
      SynchronizedBlock sync=new SynchronizedBlock();
        sync.seats=40;
        sync.start();
        SynchronizedBlock  sync1=new SynchronizedBlock();
        sync1.seats=5; //Here change the input for seats and get the different value
        sync1.start();

    }
}

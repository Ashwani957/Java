
//without Synchronization  we get a problem of data inconsistency  , Not thread Interference so that we can use the synchornized keyword


class BookTicket {
    int total_seats=10;
     synchronized void bookSeat(int seats)
    {
        if(total_seats>=seats)
        {
            System.out.println( seats +" "+ "Seats Booked Successfully");
            total_seats=total_seats-seats;
            System.out.println(total_seats);
        }
        else {
            System.out.println("Seats Cannot be booked ");
            System.out.println("Seats left +"+total_seats);
        }
    }
}
public class Synchro extends Thread {

    static BookTicket b ;
      int seats;
 public  void run() {

        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b=new BookTicket();
        Synchro sy=new Synchro();
       sy.seats=7;
       sy.start();

       Synchro sy1=new Synchro();
       sy1.seats=5;
       sy1.start();


    }
}


//Synchronzied method



class RailTicket  {

    int total_seats=50;

//    only one thread can acess this resource at a time  other resources are  waiting to update
     synchronized  void book_ticket (int seats ) {

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
}
public class SynchroOne extends Thread
{
   static  RailTicket rail ;

    int seats ;
     synchronized public  void run() {
        rail.book_ticket(seats);

    }


    public static void main(String[] args) {
rail=new RailTicket();
        SynchroOne sync=new SynchroOne();
        sync.seats=40;
        sync.start();
        SynchroOne sync1=new SynchroOne();
        sync1.seats=5; //Here change the input for seats and get the different value
        sync1.start();

    }
}

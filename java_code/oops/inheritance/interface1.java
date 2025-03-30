public class interface1 {
    public static void main (String args[])
    {
        Queen q = new Queen ();
        q.moves();
        Rook e = new Rook();
        e.moves();

    }
}

// it is a blue print of class 
interface chessplayer {
    void moves();
}


class Queen implements chessplayer {
    public void moves()
    {
        System.out.println ("moves:::up,diagnols, down , rigth , all direction ");
    }

}


class Rook implements chessplayer {
    public void moves()
    {
        System.out.println ("moves:::up, down , rigth ");
    }
    
}


class king implements chessplayer {
    public void moves()
    {
        System.out.println ("moves:::up, down , rigth ,diagnols , (BY one step)");
    }
    
}
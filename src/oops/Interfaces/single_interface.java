package oops.Interfaces;

interface ChessPlayer {
    void move();
}

class Queen implements  ChessPlayer{
    //public keyword is must required
    public void move() {
        System.out.println("up,down,left,right,diagonal(in all 4 side)");
    }
}
class Rook implements ChessPlayer{
    //public keyword is must required
    public  void move(){
        System.out.println("up,down,left,right");
    }
}

public class single_interface {
    public static void main(String[] args) {
    Queen q=new Queen();
    q.move();
    Rook r=new Rook();
    r.move();

    }
}

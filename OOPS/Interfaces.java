package OOPS;

//100% abstract
public class Interfaces {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        Hati h = new Hati();
        h.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, down, left, right");
    }
}

class Hati implements ChessPlayer{
    public void moves(){
        System.out.println("kona koni");
    }
}
class Ghora implements ChessPlayer{
    public void moves(){
        System.out.println("2 up and 1left right");
    }
}
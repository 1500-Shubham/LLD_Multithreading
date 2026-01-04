package TicTacToe;

import java.time.Period;

public class Player {
    Piece piece;
    String name;
    Player(Piece p , String name){
        this.piece = p;
        this.name=name;
    }
}

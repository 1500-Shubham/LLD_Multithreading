package TicTacToe;

enum PieceType{
    X,O
}


public class Piece {
    PieceType pieceType;
    Piece(PieceType p) {
        this.pieceType = p;
    }
}

class PieceX extends Piece{
    PieceX(PieceType p ){
        super(p);
    }
}

class PieceO extends Piece{
    PieceO(PieceType p ){
        super(p);
    }
}
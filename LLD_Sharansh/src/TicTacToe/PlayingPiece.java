package TicTacToe;

public abstract class PlayingPiece {
//    Making this extensible

    public PieceType pieceType;
//    Colour sound more information needed
    public  PlayingPiece(PieceType pieceType){
        this.pieceType=pieceType;
    }
}

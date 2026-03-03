package TicTacToe;

import java.util.ArrayList;
import java.util.List;




public class Board {
    public int size;
    private PlayingPiece board[][];

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row,int col, PlayingPiece playingPiece){
        if(row<0 || col <0 || row>= this.size || col >= this.size || board[row][col]!=null)
            return false;

        board[row][col] = playingPiece;
        return true;
    }

    public void printBoard(){
        for(int i=0;i<this.size;++i){
            for(int j=0;j<this.size;++j){
                if(board[i][j]==null){
                    System.out.print("| ");
                }else if(board[i][j].pieceType == PieceType.X){
                    System.out.print("X ");
                }else if(board[i][j].pieceType == PieceType.O){
                    System.out.print("O ");
                }
            }
            System.out.print("\n");
        }
    }

    public List<Pair<Integer,Integer>> freeCells(){
        List<Pair<Integer,Integer>> freeCell = new ArrayList<>();
        for(int i=0;i<this.size;++i){
            for(int j=0;j<this.size;++j){
                if(board[i][j]==null){
                    freeCell.add(new Pair<>(i,j));
                }
            }
        }
        return freeCell;
    }

    public boolean checkWinner(int row, int col, PlayingPiece playingPiece) {

        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagMatch = true;
        boolean antiDiagMatch = true;

        // Check Row
        for (int i = 0; i < size; i++) {
            if (board[row][i] == null || board[row][i] != playingPiece) {
                rowMatch = false;
                break;
            }
        }

        // Check Column
        for (int i = 0; i < size; i++) {
            if (board[i][col] == null || board[i][col] != playingPiece) {
                colMatch = false;
                break;
            }
        }

        // Check Main Diagonal
        if (row == col) {
            for (int i = 0; i < size; i++) {
                if (board[i][i] == null || board[i][i] != playingPiece) {
                    diagMatch = false;
                    break;
                }
            }
        } else {
            diagMatch = false;
        }

        // Check Anti-Diagonal
        if (row + col == size - 1) {
            for (int i = 0; i < size; i++) {
                if (board[i][size - i - 1] == null || board[i][size - i - 1] != playingPiece) {
                    antiDiagMatch = false;
                    break;
                }
            }
        } else {
            antiDiagMatch = false;
        }

        return rowMatch || colMatch || diagMatch || antiDiagMatch;
    }
}

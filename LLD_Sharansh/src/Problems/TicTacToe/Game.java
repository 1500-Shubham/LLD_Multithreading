package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {

    Deque<Player> playerList;
    Board board;
    Scanner sc;
    public void initializeGame() {
        playerList = new LinkedList<>();
        Piece pieceX = new Piece(PieceType.X);
        Player playerX = new Player(pieceX, "Shubham");
        Piece pieceO = new Piece(PieceType.O);
        Player playerO = new Player(pieceO, "Satyam");

        playerList.add(playerX);
        playerList.add(playerO);
        sc = new Scanner(System.in);
        board = new Board(3);
    }

    public void playGame(){
        boolean winner = true;
        while(winner){
            Player curr = playerList.removeFirst();
//            Ask for row and col
            board.printBoard();
            System.out.print("Enter row ");
            int row = sc.nextInt();

            System.out.print("Enter col: ");
            int col = sc.nextInt();

            boolean placed= board.addPiece(row,col,curr.piece);
            if(!placed){
                playerList.addFirst(curr);
                continue;
            }
            boolean win = board.checkWinner(row,col,curr.piece);
            if(win){
                System.out.println("Player"+ curr.name + "wins ");
                break;
            }

            playerList.addLast(curr);

        }


    }

}

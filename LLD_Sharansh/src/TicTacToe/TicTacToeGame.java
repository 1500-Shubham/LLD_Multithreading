package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    private Board gameBoard;
    private Deque<Player> players;

    public TicTacToeGame() {
    players = new LinkedList<>();
    }

    public void initializeGame(){
        this.gameBoard = new Board(3);
        System.out.println("Board size is" + this.gameBoard.size);
        Player player1 = new Player(new PlayingPieceX(),"Shubham");
        Player player2 = new Player(new PlayingPieceO(),"Satyam");
        players.add(player2);
        players.add(player1);
    }

    public String startGame(){
        boolean winner = false;
        while(!winner) {
            gameBoard.printBoard();

            List<Pair<Integer,Integer>> freeCell = gameBoard.freeCells();
            if(freeCell.isEmpty()){
              winner = true;
              continue;
            }

            Player top = players.getFirst();
            System.out.println("Player "+top.getName()+" enter the row and col index example 1,1 or 1,3");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();   // read full line
            String[] parts = input.split(",");   // split by comma

            int row = Integer.parseInt(parts[0].trim());
            int col = Integer.parseInt(parts[1].trim());

            System.out.println("Row: " + row);
            System.out.println("Col: " + col);

            boolean valid = gameBoard.addPiece(row,col,top.getPlayingPiece());
//            gameBoard.printBoard();
            if(!valid){
                System.out.println("Please enter valid indexes, NOT ALLOWED");
                continue;
            }
            boolean isWin = gameBoard.checkWinner(row,col, top.getPlayingPiece());

            if(isWin){
                return top.getName()+ " is Winner";
            }

            players.pop();
            players.addLast(top);
        }
        return "TIE GAME";
    }
}

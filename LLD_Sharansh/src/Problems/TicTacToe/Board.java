package TicTacToe;



public class Board {
int size;
Piece[][] pieces;
Board(int size){
    this.size = size;
    pieces = new Piece[size][size];
}

boolean addPiece(int row,int col,Piece p){
    if(pieces[row][col] != null){
        System.out.println("Board at position"+row+"and"+col+"is incorrect");
        return false;

    }else{
        pieces[row][col] = p;
        return true;
    }
}

void printBoard(){
//    for entering the correct position
    for(int i=0;i<size;++i) {
        for (int j = 0; j < size; ++j) {
            if (pieces[i][j] == null) {
                System.out.print("|");
            } else if (pieces[i][j].pieceType == PieceType.X) {
                System.out.print("X");
            } else {
                System.out.print("O");
            }
        }
        System.out.println("\n");
    }
}

boolean checkWinner(int row,int col, Piece p){
//    rows col and diagonal check
    PieceType check = p.pieceType;
//    row
    boolean r=true;
    boolean c= true;
    boolean d = true;
    boolean ad= true;
    for(int i=0;i<size;++i){
        if(pieces[i][col] == null || pieces[i][col].pieceType != check){
            r=false;
            break;
        }
    }
    for(int i=0;i<size;++i){
        if(pieces[row][i]== null ||pieces[row][i].pieceType != check){
            c=false;
            break;
        }
    }
    for(int i=0,j=0;i<size;++i,++j){
        if( pieces[i][j] == null || pieces[i][j].pieceType != check){
            d= false;
            break;
        }
    }
    for(int i=0,j=size-1;i<size;++i,--j){
        if( pieces[i][j]== null || pieces[i][j].pieceType!= check){
            ad= false;
            break;
        }
    }
    return r || c || d || ad;
}



}

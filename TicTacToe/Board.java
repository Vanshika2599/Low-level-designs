package TicTacToe;
import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    PlayingPiece Board[][];

    Board(int size){
        this.size = size;
        this.Board = new PlayingPiece[size][size];
    }

    void printBoard(){
        for(int i =0; i<size; i++){
            for(int j =0; j<size; j++){
                System.out.print(Board[i][j] + "|");
            }
            System.out.println();
        }
    }

    ArrayList<List<Integer>> getFreeSpaces() {
        ArrayList<List<Integer>> freeSpaces = new ArrayList();
        for(int i =0; i<size; i++){
            for(int j = 0; j<size; j++){
                if(Board[i][j] == null){
                    freeSpaces.add(List.of(i, j));
                }
            }
        }
        return freeSpaces;
    }

    Boolean addPiece(Integer inputRow, Integer inputCol, PlayingPiece piece){
        if(inputRow >size-1 || inputCol > size-1 || Board[inputRow][inputCol] != null ){
            return false;
        }

        Board[inputRow][inputCol] = piece;
        return true;
    }

    Boolean checkWinner(Integer row, Integer col, PlayingPiece piece){
        Boolean rowCheck = true;
        Boolean colCheck = true;
        Boolean diaChcek = true;
        Boolean antiDiaCheck = true;
        for(int j = 0; j<size; j++){
            if(Board[row][j] == null || Board[row][j] != piece ){
                rowCheck =  false;
            }
        }

        for(int i = 0; i<size; i++){
            if(Board[i][col] ==null || Board[i][col] != piece){
                colCheck = false;
            }
        }

        for(int i =0, j =0; i<size; i++, j++){
            if(Board[i][j] == null || Board[i][j] != piece){
                diaChcek = false;
            }
        }

        for(int i =0, j=size-1; i<size; i++,j--){
            if(Board[i][j] == null || Board[i][j] != piece){
                antiDiaCheck = false;
            }
        }
        return rowCheck || colCheck || diaChcek || antiDiaCheck;
    }
}

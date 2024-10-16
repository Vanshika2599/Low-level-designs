package TicTacToe;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Deque<Player> dq;
    Board board;
    Game() {
        this.board = new Board(3);
        dq = new LinkedList<Player>();
        Player player1 = new Player("Player1", PlayingPiece.X);
        Player player2 = new Player("Player2", PlayingPiece.O);
        dq.add(player1);
        dq.add(player2);
    }

    public String startGame(){
        Boolean hasWinner = false;
        while(!hasWinner){
            Player currentPlayer = dq.removeFirst();
            board.printBoard();
            ArrayList<List<Integer>>freeSpaces = board.getFreeSpaces();

            if(freeSpaces.isEmpty()){
                return "tie";
            }

            System.out.print("Player : "+currentPlayer.playerName+ "Enter your values");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String values[] = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);


            Boolean isPieceAdded  = board.addPiece(inputRow, inputCol, currentPlayer.playingPiece);
            if(!isPieceAdded){
                System.out.print("Wrong inputs, Please try again");
                dq.addFirst(currentPlayer);
                continue;
            }

            Boolean isWinner =  board.checkWinner(inputRow, inputCol, currentPlayer.playingPiece);
            if(isWinner){
                System.out.println("Winner is:"+ currentPlayer.playerName);
                return currentPlayer.playerName;
            }
            dq.addLast(currentPlayer);
        }
       return "tie";
    }
}

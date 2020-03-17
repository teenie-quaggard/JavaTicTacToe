package JavaTicTacToe.Output;

import JavaTicTacToe.Board.*;

import java.io.PrintStream;
import java.util.ArrayList;

public class OutputConsole implements Output{

    PrintStream output;

    public OutputConsole(){
       this.output = System.out;
    }

    public OutputConsole(PrintStream output){
        this.output = output;
    }

    public void welcomesPlayer(){
        output.println("😎 Welcome to Tic Tac Toe 😎");
    };

    public void displaysBoard(Board board){
        ArrayList<String> tiles = board.getTiles();
        String boardFormat = String.format("\n %s | %s | %s \n-----------\n %s | %s | %s \n-----------\n %s | %s | %s \n\n",
                (board.getTileContent(0)).equals("") ? "1" : board.getTileContent(0),
                (board.getTileContent(1)).equals("") ? "2" : board.getTileContent(1),
                (board.getTileContent(2)).equals("") ? "3" : board.getTileContent(2),
                (board.getTileContent(3)).equals("") ? "4" : board.getTileContent(3),
                (board.getTileContent(4)).equals("") ? "5" : board.getTileContent(4),
                (board.getTileContent(5)).equals("") ? "6" : board.getTileContent(5),
                (board.getTileContent(6)).equals("") ? "7" : board.getTileContent(6),
                (board.getTileContent(7)).equals("") ? "8" : board.getTileContent(7),
                (board.getTileContent(8)).equals("") ? "9" : board.getTileContent(8)
                );
        output.println(boardFormat);
    };

}
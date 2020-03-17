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
        output.println("\n\n" +
                "          _______  _        _______  _______  _______  _______   _________ _______ \n" +
                "|\\     /|(  ____ \\( \\      (  ____ \\(  ___  )(       )(  ____ \\  \\__   __/(  ___  )\n" +
                "| )   ( || (    \\/| (      | (    \\/| (   ) || () () || (    \\/     ) (   | (   ) |\n" +
                "| | _ | || (__    | |      | |      | |   | || || || || (__         | |   | |   | |\n" +
                "| |( )| ||  __)   | |      | |      | |   | || |(_)| ||  __)        | |   | |   | |\n" +
                "| || || || (      | |      | |      | |   | || |   | || (           | |   | |   | |\n" +
                "| () () || (____/\\| (____/\\| (____/\\| (___) || )   ( || (____/\\     | |   | (___) |\n" +
                "(_______)(_______/(_______/(_______/(_______)|/     \\|(_______/     )_(   (_______)\n" +
                "                                                    " +
                "                               \n" +
                "                                                      \n" +
                "  *   )            *   )              *   )           \n" +
                "` )  /( (        ` )  /(    )       ` )  /(       (   \n" +
                " ( )(_)))\\   (    ( )(_))( /(   (    ( )(_))(    ))\\  \n" +
                "(_(_())((_)  )\\  (_(_()) )(_))  )\\  (_(_()) )\\  /((_) \n" +
                "|_   _| (_) ((_) |_   _|((_)_  ((_) |_   _|((_)(_))   \n" +
                "  | |   | |/ _|    | |  / _` |/ _|    | | / _ \\/ -_)  \n" +
                "  |_|   |_|\\__|    |_|  \\__,_|\\__|    |_| \\___/\\___|  \n" +
                "                                                      \n");
    };

    public void gameInstructions(){
        output.println("\n" +
            "RULES OF THE GAME:\n" +
                "The object of Tic Tac Toe is to get three in a row. \n" +
                "You'll be playing on a three by three game board grid. \n" +
                "The first player will be known as 𝕏 and the second as 𝟘. \n" +
                "Players alternate placing 𝕏s and 𝟘s on the game board \n" +
                "until one opponent has three of their markers in a row or \n" +
                "all nine squares are filled. 𝕏 always goes first, and in \n" +
                "the event that no one has three in a row, the stalemate is " +
                "\ncalled a cat game. Meow. 🐈\n");
    }

    public void displaysBoard(Board board){
        ArrayList<String> tiles = board.getTiles();
        String boardFormat =
                String.format("\n %s | %s | %s \n-----------\n %s | %s | %s \n-----------\n %s | %s | %s \n\n",
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

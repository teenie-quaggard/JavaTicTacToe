package JavaTicTacToe.Output;

import JavaTicTacToe.Board.*;
import JavaTicTacToe.Player.MarkerTypes;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class OutputConsole implements Output{

    PrintStream output;
    InputStream input;

    public OutputConsole(){
        this.output = System.out;
        this.input = System.in;
    }

    public OutputConsole(PrintStream output, InputStream input){
        this.output = output;
        this.input = input;
    }

    public String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
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

    public void promptForInstructions(){
        output.println("Would you like to see the rules of the game? (Y/N):");

        String input = getInput();
        String capitalizedInput = capitalize(input);

        if (capitalizedInput.equals("Y")) {
            gameInstructions();
        } else {
            output.println("Great, let's get playing.");
        }
    }

    public void gameInstructions(){
        output.println("\n" +
            "THE RULES:\n" +
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

    public void promptTurn(MarkerTypes mark){
        output.println("\n\nPlayer " + mark + ", you're up!\n");
    }

    public String getMove(){
        output.println("Make your move! Choose an available space " +
                "between 1-9:");
        return getInput();
    }

    public void congratulatesWinner(MarkerTypes mark){
        output.println("\n\nPlayer " + mark + ", you are the winner, " +
                "winner " +
                "chicken " +
                "dinner! 🍗 \n");
    }

    public void tieGame(){
        output.println("\n\nYou get to choose whether you are " +
                "both winners...or both losers. 😸 " +
                "Meow!\n");
    }

    private String capitalize(String input){
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}

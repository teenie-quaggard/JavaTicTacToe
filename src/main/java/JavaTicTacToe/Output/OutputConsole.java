package JavaTicTacToe.Output;

import JavaTicTacToe.Board.*;
import JavaTicTacToe.InputValidator.InputValidator;
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
        boolean validatedInput = validateYesOrNoInput(capitalizedInput);

        if (validatedInput && capitalizedInput.equals("Y")) {
            gameInstructions();
        } else if (validatedInput && capitalizedInput.equals("N")){
            output.println("Great, let's get playing.");
        } else {
            output.println("Sorry, check your input value and try again! We " +
                    "are looking for either Y or N.");
            promptForInstructions();
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
        output.println("\nPlayer " + mark + ", you're up!");
    }

    public String getMove(){
        output.println("Choose an available space " +
                "between 1-9:");
        String input = getInput();
        boolean validatedInput = validateIntegerRange(input);

        if (validatedInput) {
            return input;
        } else {
            output.println("Sorry, invalid input! Try again with a number " +
                    "between 1 to 9.");
            return getMove();
        }
    }

    public void congratulatesWinner(MarkerTypes mark){
        output.println("\n\nWINNER, WINNER, CHICKEN DINNER! Player " + mark +
        ", you win!!! 🍗👑💸");
    }

    public void tieGame(){
        output.println("\n\nYou get to choose whether you are " +
                "both winners...or both losers. 😸 " +
                "Meow!\n");
    }

    public boolean playAgain(){
        output.println("Would you like to play again? (Y/N):");

        String input = getInput();
        String capitalizedInput = capitalize(input);
        boolean validatedInput = validateYesOrNoInput(capitalizedInput);

        if (validatedInput && capitalizedInput.equals("Y")) {
            output.println("Great, another round!");
            return true;
        } else if (validatedInput && capitalizedInput.equals("N")){
            output.println("No worries, see you next time. 👋🏼");
            return false;
        } else {
            output.println("Sorry, check your input value and try again! We " +
                    "are looking for either Y or N.");
            return playAgain();
        }
    }

    public void badMove(){
        output.println("Sorry, that move has already been made! Try again with" +
                " a tile that doesn't already have an X or O on it.");
    }

    private String capitalize(String input){
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    private boolean validateYesOrNoInput(String input){
        return InputValidator.yesOrNoValidation(input);
    }

    private boolean validateIntegerRange(String input){
        return InputValidator.integerRangeValidation(input);
    }
}

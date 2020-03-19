package JavaTicTacToe.Output;
import JavaTicTacToe.Board.*;

import JavaTicTacToe.Player.MarkerTypes;
import JavaTicTacToe.Player.Player;
import JavaTicTacToe.Player.PlayerHuman;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OutputConsoleTest {

    @Test
    void getInputShouldAcceptUserInput() {
        OutputConsole console = new OutputConsole();
        String input = "Boo";
        InputStream in = new ByteArrayInputStream(input.getBytes());

        System.setIn(in);

        assertEquals("Boo", console.getInput());
    }

    @Test
    void welcomesPlayerShouldPrintWelcomeMessage() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        InputStream in = new ByteArrayInputStream("".getBytes());
        OutputConsole console = new OutputConsole(out, in);

        console.welcomesPlayer();

        assertEquals("\n\n" +
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
                "                                                      \n\n", output.toString());
    }

    @Test
    void promptForInstructionsPrintsGameInstructionsWhenAskedByUser(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        String input = "y";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        OutputConsole console = new OutputConsole(out, in);
        System.setIn(in);

        console.promptForInstructions();
        assertEquals("Would you like to see the rules of the game? (Y/N):\n\n" +
                "THE RULES:\n" +
                "The object of Tic Tac Toe is to get three in a row. \n" +
                "You'll be playing on a three by three game board grid. \n" +
                "The first player will be known as 𝕏 and the second as 𝟘. \n" +
                "Players alternate placing 𝕏s and 𝟘s on the game board \n" +
                "until one opponent has three of their markers in a row or \n" +
                "all nine squares are filled. 𝕏 always goes first, and in \n" +
                "the event that no one has three in a row, the stalemate is " +
                "\ncalled a cat game. Meow. 🐈\n\n", output.toString());
    }

    @Test
    void gameInstructionsPrintsMessage() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        InputStream in = new ByteArrayInputStream("".getBytes());
        OutputConsole console = new OutputConsole(out, in);

        console.gameInstructions();

        assertEquals("\n" +
                "THE RULES:\n" +
                "The object of Tic Tac Toe is to get three in a row. \n" +
                "You'll be playing on a three by three game board grid. \n" +
                "The first player will be known as 𝕏 and the second as 𝟘. \n" +
                "Players alternate placing 𝕏s and 𝟘s on the game board \n" +
                "until one opponent has three of their markers in a row or \n" +
                "all nine squares are filled. 𝕏 always goes first, and in \n" +
                "the event that no one has three in a row, the stalemate is " +
                "\ncalled a cat game. Meow. 🐈\n\n", output.toString());
    }

    @Test
    void displaysBoard() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        InputStream in = new ByteArrayInputStream("".getBytes());
        OutputConsole console = new OutputConsole(out, in);
        Board board = BoardFactory.createBoard(BoardTypes.THREE_X_THREE);

        console.displaysBoard(board);

        assertEquals( "\n 1 | 2 | 3 \n-----------\n 4 |" +
                " 5 | 6 \n-----------\n 7 | 8 | 9 \n\n\n", output.toString());
    }

    @Test
    void promptTurnPromptsPlayerTurnUsingTheirMark(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        InputStream in = new ByteArrayInputStream("".getBytes());
        OutputConsole console = new OutputConsole(out, in);

        Player player = new PlayerHuman(MarkerTypes.X, console);
        MarkerTypes mark = player.getMark();

        console.promptTurn(mark);

        assertEquals("\n\nPlayer X, you're up!\n\n",
                output.toString());
    }

    @Test
    void getMovePromptsUserToMakeAMove(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        String input = "9";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        OutputConsole console = new OutputConsole(out, in);
        System.setIn(in);
        console.getMove();
        assertEquals("Make your move! Choose an available space between " +
                        "1-9:\n"
                , output.toString());
    }

    @Test
    void getMovePromptsUserToMakeAMoveAndTakesInput(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        InputStream in = new ByteArrayInputStream("9".getBytes());
        OutputConsole console = new OutputConsole(out, in);
        System.setIn(in);

        assertEquals("9", console.getMove());
    }

    @Test
    void congratulatesWinnerPrintsMessage() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        InputStream in = new ByteArrayInputStream("".getBytes());
        OutputConsole console = new OutputConsole(out, in);
        Board board = BoardFactory.createBoard(BoardTypes.THREE_X_THREE);

        console.congratulatesWinner(MarkerTypes.X);

        assertEquals( "\n\nPlayer X, you are the winner, winner " +
                "chicken dinner! 🍗 \n\n", output.toString());
    }

    @Test
    void tieGamePrintsMessage() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        InputStream in = new ByteArrayInputStream("".getBytes());
        OutputConsole console = new OutputConsole(out, in);
        Board board = BoardFactory.createBoard(BoardTypes.THREE_X_THREE);

        console.tieGame();

        assertEquals( "\n\nYou get to choose whether you are " +
                "both winners...or both losers. 😸 " +
                "Meow!\n\n", output.toString());
    }
}
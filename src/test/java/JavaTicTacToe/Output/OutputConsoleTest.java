package JavaTicTacToe.Output;
import JavaTicTacToe.Board.*;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OutputConsoleTest {

    @Test
    void welcomesPlayer() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        OutputConsole console = new OutputConsole(stream);

        console.welcomesPlayer();
        assertEquals(output.toString(), "\n\n" +
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
                "                                                      \n\n");

    }

    @Test
    void gameInstructions() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        OutputConsole console = new OutputConsole(stream);

        console.gameInstructions();
        assertEquals(output.toString(), "\n" +
                "RULES OF THE GAME:\n" +
                "The object of Tic Tac Toe is to get three in a row. \n" +
                "You'll be playing on a three by three game board grid. \n" +
                "The first player will be known as 𝕏 and the second as 𝟘. \n" +
                "Players alternate placing 𝕏s and 𝟘s on the game board \n" +
                "until one opponent has three of their markers in a row or \n" +
                "all nine squares are filled. 𝕏 always goes first, and in \n" +
                "the event that no one has three in a row, the stalemate is " +
                "\ncalled a cat game. Meow. 🐈\n\n");
    }

    @Test
    void displaysBoard() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        OutputConsole console = new OutputConsole(stream);
        Board board = BoardFactory.createBoard(BoardTypes.THREE_X_THREE);

        console.displaysBoard(board);
        assertEquals(output.toString(), "\n 1 | 2 | 3 \n-----------\n 4 |" +
                " 5 | 6 \n-----------\n 7 | 8 | 9 \n\n\n");

    }
}
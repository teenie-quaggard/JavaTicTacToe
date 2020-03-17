package Output;

import Board.*;
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
        assertEquals(output.toString(), "😎 Welcome to Tic Tac Toe 😎\n");

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
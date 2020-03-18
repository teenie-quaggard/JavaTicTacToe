package JavaTicTacToe.Input;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class InputConsoleTest {

    @Test
    void getUserInputShouldAcceptUserInput()  {
        InputConsole console = new InputConsole();
        String input = "Boo";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("Boo", console.getInput());

    }
}
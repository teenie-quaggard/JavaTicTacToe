package JavaTicTacToe.Player;

import JavaTicTacToe.Output.Output;
import JavaTicTacToe.Output.OutputConsole;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PlayerHumanTest {

    @Test
    void getMarkReturnsTheMarkOfAPlayer() {
        Output output = new OutputConsole();
        Player player = new PlayerHuman(MarkerTypes.X, output);
        MarkerTypes mark = player.getMark();
        assertEquals(MarkerTypes.X, mark);
    }

    @Test
    void makeMoveReturnsAStringWithTheUserMove(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(output);
        InputStream in = new ByteArrayInputStream("7".getBytes());
        OutputConsole console = new OutputConsole(out, in);
        System.setIn(in);

        Player player = new PlayerHuman(MarkerTypes.X, console);
        String move = player.makeMove();

        assertEquals("7", move);
    }
}
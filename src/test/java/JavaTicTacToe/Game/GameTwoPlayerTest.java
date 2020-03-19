package JavaTicTacToe.Game;

import JavaTicTacToe.Board.BoardThreeXThree;
import JavaTicTacToe.Output.Output;
import JavaTicTacToe.Output.OutputConsole;
import JavaTicTacToe.Player.MarkerTypes;
import JavaTicTacToe.Player.PlayerHuman;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameTwoPlayerTest {

    @Test
    void play() {
    }

    @Test
    void turn() {
    }

    @Test
    void togglePlayerChangesCurrentPlayer(){
        OutputConsole output = new OutputConsole();
        PlayerHuman player1 = new PlayerHuman(MarkerTypes.X,
                output);
        PlayerHuman player2 = new PlayerHuman(MarkerTypes.O,
                output);
        BoardThreeXThree board =
                new BoardThreeXThree(new ArrayList<>(Arrays.asList("", "X",
                        "", "", "", "", "", "", "")));
        GameTwoPlayer game = new GameTwoPlayer(output, board, player1, player2);

        game.togglePlayer();

        assertEquals(player2, game.currentPlayer);
    }
}
package JavaTicTacToe.Game;

import JavaTicTacToe.Game.Game;
import JavaTicTacToe.Game.GameFactory;
import JavaTicTacToe.Game.GameTwoPlayer;
import JavaTicTacToe.Game.GameTypes;
import JavaTicTacToe.Output.Output;
import JavaTicTacToe.Output.OutputFactory;
import JavaTicTacToe.Output.OutputTypes;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class GameFactoryTest {

    @Test
    void createGameCreatesANewInstanceOfGame() {
        Output output = OutputFactory.createOutput(OutputTypes.CONSOLE);
        Game twoPlayerGame = GameFactory.createGame(GameTypes.TWO_PLAYER, output);
        assertThat(twoPlayerGame, instanceOf(GameTwoPlayer.class));
    }

    @Test
    void createGameThrowsAnExceptionWhenPassedIncorrectGameType() {
        Output output = OutputFactory.createOutput(OutputTypes.CONSOLE);
        Throwable exception = assertThrows(Throwable.class, () -> GameFactory.createGame(null, output));
        assertTrue(exception.getMessage().contains("Incorrect gameType passed into GameFactory."));
    }
}
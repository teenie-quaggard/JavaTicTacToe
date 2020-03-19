package JavaTicTacToe.Player;
import JavaTicTacToe.Output.Output;
import JavaTicTacToe.Output.OutputConsole;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlayerFactoryTest {

    @Test
    void createPlayerCreatesAHumanPlayer() {
        Output console = new OutputConsole();
        Player player = PlayerFactory.createPlayer(PlayerTypes.HUMAN,
                MarkerTypes.X, console);
        assertThat(player, instanceOf(PlayerHuman.class));
    }

    @Test
    void createPlayerThrowsAnExceptionWhenPassedAnIncorrectPlayerType(){
        Output console = new OutputConsole();
        Throwable exception = assertThrows(Throwable.class,
                () -> PlayerFactory.createPlayer(null,
                        null, console));
        assertTrue(exception.getMessage().contains("Incorrect playerType passed into PlayerFactory."));
    }
}
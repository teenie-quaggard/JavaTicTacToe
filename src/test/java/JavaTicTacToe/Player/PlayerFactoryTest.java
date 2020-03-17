package JavaTicTacToe.Player;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlayerFactoryTest {

    @Test
    void createPlayerCreatesAHumanPlayer() {
        Player player = PlayerFactory.createPlayer(PlayerTypes.HUMAN);
        assertThat(player, instanceOf(PlayerHuman.class));
    }

    @Test
    void createPlayerThrowsAnExceptionWhenPassedAnIncorrectPlayerType(){
        Throwable exception = assertThrows(Throwable.class, () -> PlayerFactory.createPlayer(null));
        assertTrue(exception.getMessage().contains("Incorrect playerType passed into PlayerFactory."));
    }
}
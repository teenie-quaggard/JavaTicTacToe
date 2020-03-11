import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsNot.not;

class PlayerFactoryTest {

    @Test
    void createPlayerCreatesAHumanPlayer() {
        PlayerFactory playerFactory = new PlayerFactory();
        Player player = playerFactory.createPlayer(PlayerTypes.HUMAN);
        assertThat(player, instanceOf(PlayerHuman.class));
    }

    @Test
    void createPlayerNeedsAStringPassedToIt() {
        PlayerFactory playerFactory = new PlayerFactory();
        Player nullPlayer = playerFactory.createPlayer(null);
        assertThat(nullPlayer, not(instanceOf(PlayerHuman.class)));
    }
}
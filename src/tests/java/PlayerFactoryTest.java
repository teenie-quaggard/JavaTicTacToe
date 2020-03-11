import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

class PlayerFactoryTest {

    @Test
    void createPlayerCreatesAHumanPlayer() {
        PlayerFactory playerFactory = new PlayerFactory();
        Player player = playerFactory.createPlayer("Human");
        assertThat(player, instanceOf(HumanPlayer.class));
    }
}
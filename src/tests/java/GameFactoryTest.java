import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsNot.not;


class GameFactoryTest {

    @Test
    void createGameCreatesANewInstanceOfGame() {
        Game twoPlayerGame = GameFactory.createGame(GameTypes.TWO_PLAYER);
        assertThat(twoPlayerGame, instanceOf(GameTwoPlayer.class));
    }

    @Test
    void createGameRequiresAGameType() {
        GameFactory gameFactory = new GameFactory();
        Game nullGame = gameFactory.createGame(null);
        assertThat(nullGame, not(instanceOf(GameTwoPlayer.class)));
    }
}
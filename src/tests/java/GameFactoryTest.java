import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsNot.not;


class GameFactoryTest {

    @Test
    void createGameCreatesANewInstanceOfGame() {
        GameFactory gameFactory = new GameFactory();
        Game twoPlayerGame = gameFactory.createGame("TwoPlayerGame");
        assertThat(twoPlayerGame, instanceOf(TwoPlayerGame.class));
    }

    @Test
    void createGameRequiresAGameType() {
        GameFactory gameFactory = new GameFactory();
        Game nullGame = gameFactory.createGame("Null");
        assertThat(nullGame, not(instanceOf(TwoPlayerGame.class)));
    }
}
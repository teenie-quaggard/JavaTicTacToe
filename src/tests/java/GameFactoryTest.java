import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;


class GameFactoryTest {

    @Test
    void createGameCreatesANewInstanceOfGame() {
        GameFactory gameFactory = new GameFactory();
        Game twoPlayerGame = gameFactory.createGame("TwoPlayerGame");
        assertThat(twoPlayerGame, instanceOf(TwoPlayerGame.class));
    }
}
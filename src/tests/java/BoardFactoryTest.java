import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.*;

class BoardFactoryTest {


    @Test
    void createBoardCreatesANewInstanceOfBoard() {
        BoardFactory gameFactory = new BoardFactory();
        Board threeByThreeBoard = gameFactory.createBoard(BoardTypes.THREE_X_THREE);
        assertThat(threeByThreeBoard, instanceOf(BoardThreeXThree.class));
    }

    @Test
    void createBoardRequiresABoardType() {
        BoardFactory boardFactory = new BoardFactory();
        Board nullBoard = boardFactory.createBoard(null);
        assertThat(nullBoard, not(instanceOf(BoardThreeXThree.class)));
    }
}

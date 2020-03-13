import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BoardFactoryTest {

    @Test
    void createBoardCreatesANewInstanceOfBoard() {
        Board threeByThreeBoard = BoardFactory.createBoard(BoardTypes.THREE_X_THREE);
        assertThat(threeByThreeBoard, instanceOf(BoardThreeXThree.class));
    }

    @Test
    public void createBoardThrowsAnExceptionWhenPassedAnIncorrectBoardType() {
        Throwable exception = assertThrows(Throwable.class, () -> BoardFactory.createBoard(null));
        assertTrue(exception.getMessage().contains("Incorrect boardType passed into BoardFactory."));
    }


}

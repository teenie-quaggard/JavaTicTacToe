package JavaTicTacToe.Player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerHumanTest {

    @Test
    void getMarkReturnsTheMarkOfAPlayer() {
        Player player = new PlayerHuman(MarkerTypes.X);
        MarkerTypes mark = player.getMark();
        assertEquals(MarkerTypes.X, mark);
    }

    @Test
    void makeMove() {

    }
}
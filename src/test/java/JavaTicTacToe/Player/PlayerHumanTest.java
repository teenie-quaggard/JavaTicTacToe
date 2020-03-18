package JavaTicTacToe.Player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerHumanTest {

    @Test
    void getMarkReturnsTheMarkOfAPlayer() {
        Player player = new PlayerHuman("𝕏");
        String mark = player.getMark();
        assertEquals("𝕏", mark);
    }

    @Test
    void makeMove() {

    }
}
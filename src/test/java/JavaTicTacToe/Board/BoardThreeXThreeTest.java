package JavaTicTacToe.Board;

import JavaTicTacToe.Board.BoardThreeXThree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BoardThreeXThreeTest {

    @Test
    void availableSpacesReturnsTilesWithoutMarkers() {
        ArrayList<String> tiles = new ArrayList<>(Arrays.asList("", "", "", "", "", "", "", "", ""));
        BoardThreeXThree board = new BoardThreeXThree(tiles);
        ArrayList<String> availableTiles = board.availableTiles();
        assertEquals(availableTiles, tiles);
    }

    @Test
    void getTileContentReturnsContentOfTile() {
        ArrayList<String> tiles = new ArrayList<>(Arrays.asList("", "X", "", "", "", "", "", "", ""));
        BoardThreeXThree board = new BoardThreeXThree(tiles);
        String tileContentX = board.getTileContent(1);
        String tileContentNull = board.getTileContent(0);
        assertEquals(tileContentX, "X");
        assertEquals(tileContentNull, "");

    }
}
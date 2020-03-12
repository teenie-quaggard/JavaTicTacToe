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

}
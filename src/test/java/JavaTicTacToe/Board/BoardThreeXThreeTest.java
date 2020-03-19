package JavaTicTacToe.Board;

import JavaTicTacToe.Player.MarkerTypes;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BoardThreeXThreeTest {

    @Test
    void availableSpacesReturnsTilesWithoutMarkers() {
        ArrayList<String> tiles = new ArrayList<>(Arrays.asList("", "X", "",
                "", "", "", "", "", ""));
        BoardThreeXThree board = new BoardThreeXThree(tiles);
        ArrayList<Integer> availableTiles = board.availableTiles();
        assertEquals(Arrays.asList(0,2,3,4,5,6,7,8), availableTiles);
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

    @Test
    void placeMoveInsertsCorrectMarkerOnCorrectBoardTile(){
        ArrayList<String> tiles = new ArrayList<>(Arrays.asList("", "", "", "", "", "", "", "", ""));
        BoardThreeXThree board = new BoardThreeXThree(tiles);

        board.placeMove(MarkerTypes.X, "1");
        assertEquals("X" , board.getTileContent(0));
        assertEquals(Arrays.asList("" +
                        "X", "", "", "", "", "", "", "", "") ,
                board.getTiles());
    }

    @Test
    void winningBoardReturnsTrueWhenGameIsWon(){
        ArrayList<String> winningTiles = new ArrayList<>(Arrays.asList("X",
                "X", "X",
                "", "", "", "", "", ""));
        BoardThreeXThree winningBoard =
                new BoardThreeXThree(winningTiles);

        ArrayList<String> noWinTiles = new ArrayList<>(Arrays.asList("X",
                "X", "",
                "", "", "", "", "", ""));
        BoardThreeXThree noWinBoard =
                new BoardThreeXThree(noWinTiles);


        assertTrue(winningBoard.winningBoard(MarkerTypes.X));
        assertFalse(noWinBoard.winningBoard(MarkerTypes.O));
    }

    @Test
    void movesMadeByPlayerReturnsListOfIndicesPlayedByOnePlayer(){
        ArrayList<String> tiles = new ArrayList<>(Arrays.asList("", "", "X",
                "", "", "X", "X", "", ""));
        BoardThreeXThree board = new BoardThreeXThree(tiles);

        assertEquals(Arrays.asList(2,5,6), board.movesMadeByPlayer(MarkerTypes.X));
    }
}
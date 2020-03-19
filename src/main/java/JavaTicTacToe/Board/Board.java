package JavaTicTacToe.Board;

import JavaTicTacToe.Player.MarkerTypes;

import java.util.ArrayList;

public interface Board {
    ArrayList<String> availableTiles();
    ArrayList<String> getTiles();
    String getTileContent(Integer tileIndex);
    String placeMove(MarkerTypes mark, String tileNumber);
}

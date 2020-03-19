package JavaTicTacToe.Board;

import JavaTicTacToe.Player.MarkerTypes;

import java.util.ArrayList;

public interface Board {
    ArrayList<Integer> availableTiles();
    ArrayList<String> getTiles();
    String getTileContent(Integer tileIndex);
    String placeMove(MarkerTypes mark, String tileNumber);
    boolean winningBoard(MarkerTypes mark);
    ArrayList<Integer> movesMadeByPlayer(MarkerTypes mark);
}

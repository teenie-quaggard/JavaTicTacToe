package JavaTicTacToe.Board;

import java.util.ArrayList;

public interface Board {
    ArrayList<String> availableTiles();
    ArrayList<String> getTiles();
    String getTileContent(Integer tileIndex);
}

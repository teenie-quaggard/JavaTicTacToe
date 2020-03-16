package Board;

import java.util.ArrayList;

public class BoardThreeXThree implements Board {

    ArrayList<String> tiles;

    BoardThreeXThree(ArrayList<String> tiles) {
        this.tiles = tiles;
    }

    @Override
    public ArrayList<String> availableTiles() { return tiles; }

    @Override
    public ArrayList<String> getTiles() {
        return tiles;
    }

    @Override
    public String getTileContent(Integer tileIndex) {
        return tiles.get(tileIndex);
    }

}

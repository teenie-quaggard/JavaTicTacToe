import java.util.ArrayList;

public class BoardThreeXThree implements Board {

    ArrayList<String> tiles;

    BoardThreeXThree(ArrayList<String> tiles) {
        this.tiles = tiles;
    }

    @Override
    public ArrayList<String> availableTiles() {
        return tiles;
    }

}

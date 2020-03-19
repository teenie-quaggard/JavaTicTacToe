package JavaTicTacToe.Board;

import JavaTicTacToe.Player.MarkerTypes;

import java.util.ArrayList;

public class BoardThreeXThree implements Board {

    ArrayList<String> tiles;

    public BoardThreeXThree(ArrayList<String> tiles) {
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

    @Override
    public String placeMove(MarkerTypes mark, String userInput){
        int tileIndex = getTileIndex(userInput);
        String markString = mark.toString();
        return tiles.set(tileIndex, markString);
    }

    private int getTileIndex(String userInput) {
        return Integer.parseInt(userInput) - 1;
    }
}

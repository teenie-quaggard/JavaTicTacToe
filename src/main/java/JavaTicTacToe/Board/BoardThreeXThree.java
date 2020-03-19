package JavaTicTacToe.Board;

import JavaTicTacToe.Player.MarkerTypes;

import java.util.ArrayList;
import java.util.Arrays;

public class BoardThreeXThree implements Board {

    ArrayList<String> tiles;

    public BoardThreeXThree(ArrayList<String> tiles) {
        this.tiles = tiles;
    }

    @Override
    public ArrayList<Integer> availableTiles() {
        ArrayList<Integer> freeSpaces = new ArrayList<Integer>();

        for (int i=0; i<tiles.size(); i++){
            String tile = getTileContent(i);

            if ("".equals(tile)){
                freeSpaces.add(i);
            }
        }
        return freeSpaces;
    }

    @Override
    public ArrayList<String> getTiles() {
        return tiles;
    }

    @Override
    public String getTileContent(Integer tileIndex) {
        return tiles.get(tileIndex);
    }

    @Override
    public String placeMove(MarkerTypes mark, String userInput) {
        int tileIndex = getTileIndex(userInput);
        String markString = mark.toString();
        return tiles.set(tileIndex, markString);
    }

    @Override
    public boolean winningBoard(MarkerTypes mark) {
        Integer[][] winningIndices = new Integer[][]{
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {0, 3, 6},
                {1, 4, 7},
                {2, 5, 8},
                {0, 4, 8},
                {2, 4, 6}
        };

        boolean winner = false;
        for(Integer[] winningRow : winningIndices) {
              if (movesMadeByPlayer(mark).containsAll(Arrays.asList(winningRow))){
                  winner = true;
              }
        }
        return winner;
    }

    @Override
    public boolean tieBoard(MarkerTypes mark){
        return !winningBoard(mark) && availableTiles().isEmpty();
    }


    @Override
    public ArrayList<Integer> movesMadeByPlayer(MarkerTypes mark){
        ArrayList<Integer> movesMade = new ArrayList<Integer>();

        for (int i=0; i<tiles.size(); i++){
           String tile = getTileContent(i);

           if (mark.toString().equals(tile)){
               movesMade.add(i);
           }
        }
        return movesMade;
    }

    private int getTileIndex(String userInput) {
        return Integer.parseInt(userInput) - 1;
    }


}

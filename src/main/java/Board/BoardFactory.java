package Board;

import java.util.ArrayList;
import java.util.Arrays;

public class BoardFactory {
    public static Board createBoard(BoardTypes boardTypes) {
        if (boardTypes == BoardTypes.THREE_X_THREE) {
            ArrayList<String> tiles = new ArrayList<>(Arrays.asList("", "", "", "", "", "", "", "", ""));
            return new BoardThreeXThree(tiles);
        } else {
            throw new Error("Incorrect boardType passed into BoardFactory.");
        }
    }
}

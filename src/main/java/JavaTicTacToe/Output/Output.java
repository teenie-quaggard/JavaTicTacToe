package JavaTicTacToe.Output;

import JavaTicTacToe.Board.Board;
import JavaTicTacToe.Player.MarkerTypes;

public interface Output {
    void welcomesPlayer();
    void displaysBoard(Board board);
    void gameInstructions();
    void promptForInstructions();
    void promptTurn(MarkerTypes mark);
    String getInput();
    String getMove();
}

package JavaTicTacToe.Output;

import JavaTicTacToe.Board.Board;
import JavaTicTacToe.Player.MarkerTypes;

public interface Output {
    void welcomesPlayer();
    void displaysBoard(Board board);
    void gameInstructions();
    void promptForInstructions();
    void promptTurn(MarkerTypes mark);
    void congratulatesWinner(MarkerTypes mark);
    void tieGame();
    String getInput();
    String getMove();
}

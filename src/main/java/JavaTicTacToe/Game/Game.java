package JavaTicTacToe.Game;

public interface Game {
    void play();
    void turn();
    void togglePlayer();
    boolean playAgain();
    boolean gameOver();
}

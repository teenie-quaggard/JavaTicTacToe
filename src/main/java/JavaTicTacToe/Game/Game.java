package JavaTicTacToe.Game;

public interface Game {
    void play();
    void turn();
    void checkIfGameOver();
    void tieGame();
    void winningGame();
    void togglePlayer();
    boolean playAgain();
    boolean gameOver();
}

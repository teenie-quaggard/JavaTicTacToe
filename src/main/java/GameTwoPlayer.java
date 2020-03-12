public class GameTwoPlayer implements Game {

    Board board;
    Player currentPlayer;
    Player player1;
    Player player2;

    public GameTwoPlayer(Board board, Player player1, Player player2) {
        this.board = board;
        this.currentPlayer = player1;
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public void play() {
        System.out.println("In Two player game.");
    }
}

package JavaTicTacToe.Player;

public class PlayerHuman implements Player {

    String marker;

    public PlayerHuman(String marker){
        this.marker = marker;
    }

    public String getMark() { return marker; }

    @Override
    public int makeMove() {
        return 0;
    }
}

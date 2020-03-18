package JavaTicTacToe.Player;

public class PlayerHuman implements Player {

    MarkerTypes marker;

    public PlayerHuman(MarkerTypes marker){
        this.marker = marker;
    }

    public MarkerTypes getMark() { return marker; }

    @Override
    public int makeMove() {
        return 0;
    }
}

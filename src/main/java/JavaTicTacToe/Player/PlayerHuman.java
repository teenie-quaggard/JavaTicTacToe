package JavaTicTacToe.Player;

import JavaTicTacToe.Output.*;

public class PlayerHuman implements Player {

    MarkerTypes marker;
    Output output;

    public PlayerHuman(MarkerTypes marker, Output output){
        this.marker = marker;
        this.output = output;
    }

    public MarkerTypes getMark() { return marker; }

    public String makeMove() {
        return output.getMove();
    }
}

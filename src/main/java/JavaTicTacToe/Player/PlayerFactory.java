package JavaTicTacToe.Player;

import JavaTicTacToe.Output.*;

public class PlayerFactory {

    Output output;

    public PlayerFactory(Output output) {
        this.output = output;
    }

    public static Player createPlayer(PlayerTypes playerType,
                                      MarkerTypes marker, Output output) {
        if (playerType == PlayerTypes.HUMAN) {
            return new PlayerHuman(marker, output);
        } else {
            throw new Error("Incorrect playerType passed into PlayerFactory.");
        }
    }
}

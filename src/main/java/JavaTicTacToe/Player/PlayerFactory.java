package JavaTicTacToe.Player;

public class PlayerFactory {
    public static Player createPlayer(PlayerTypes playerType, MarkerTypes marker) {
        if (playerType == PlayerTypes.HUMAN) {
            return new PlayerHuman(marker);
        } else {
            throw new Error("Incorrect playerType passed into PlayerFactory.");
        }
    }
}

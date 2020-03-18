package JavaTicTacToe.Player;

public class PlayerFactory {
    public static Player createPlayer(PlayerTypes playerType) {
        if (playerType == PlayerTypes.HUMAN) {
            return new PlayerHuman("𝕏");
        } else {
            throw new Error("Incorrect playerType passed into PlayerFactory.");
        }
    }
}

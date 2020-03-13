public class PlayerFactory {
    public static Player createPlayer(PlayerTypes playerType) {
        if (playerType == PlayerTypes.HUMAN) {
            return new PlayerHuman();
        } else {
            throw new java.lang.Error("Incorrect playerType passed into PlayerFactory.");
        }
    }
}

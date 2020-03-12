public class PlayerFactory {
    public static Player createPlayer(PlayerTypes playerType) {
        if (playerType == PlayerTypes.HUMAN) {
            return new PlayerHuman();
        } else {
            return null;
        }
    }
}

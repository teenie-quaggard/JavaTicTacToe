public class PlayerFactory {
    public Player createPlayer(PlayerTypes playerType) {
        if (playerType == PlayerTypes.HUMAN) {
            return new HumanPlayer();
        } else {
            return null;
        }
    }
}

public class PlayerFactory {
    public Player createPlayer(String playerType) {
        if (playerType.equalsIgnoreCase("Human")) {
            return new HumanPlayer();
        } else {
            return null;
        }
    }
}

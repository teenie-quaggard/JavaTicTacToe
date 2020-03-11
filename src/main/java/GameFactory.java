public class GameFactory {
    public Game createGame(String gameType) {
        if (gameType.equalsIgnoreCase("TwoPlayerGame")) {
            return new TwoPlayerGame();
        } else {
            return null;
        }
    }
}

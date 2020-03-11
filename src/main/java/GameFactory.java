public class GameFactory {
    public Game createGame(GameTypes gameType) {
        if (gameType == GameTypes.TWO_PLAYER) {
            return new GameTwoPlayer();
        } else {
            return null;
        }
    }
}

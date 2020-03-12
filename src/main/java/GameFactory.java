public class GameFactory {

    public static Game createGame(GameTypes gameType) {
        if (gameType == GameTypes.TWO_PLAYER) {

            Board board = BoardFactory.createBoard(BoardTypes.THREE_X_THREE);
            Player player1 = PlayerFactory.createPlayer(PlayerTypes.HUMAN);
            Player player2 = PlayerFactory.createPlayer(PlayerTypes.HUMAN);

            return new GameTwoPlayer(board, player1, player2);
        } else {
            return null;
        }
    }
}

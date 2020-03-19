package JavaTicTacToe.Game;

import JavaTicTacToe.Board.*;
import JavaTicTacToe.Output.*;
import JavaTicTacToe.Player.*;


public class GameFactory {

    Output output;

    public GameFactory(Output output) {
        this.output = output;
    }

    public static Game createGame(GameTypes gameType, Output output) {
        if (gameType == GameTypes.TWO_PLAYER) {

            Board board = BoardFactory.createBoard(BoardTypes.THREE_X_THREE);
            Player player1 = PlayerFactory.createPlayer(PlayerTypes.HUMAN,
                    MarkerTypes.X, output);
            Player player2 = PlayerFactory.createPlayer(PlayerTypes.HUMAN,
                    MarkerTypes.O, output);

            return new GameTwoPlayer(output, board, player1, player2);
        } else {
            throw new Error("Incorrect gameType passed into GameFactory.");
        }
    }
}

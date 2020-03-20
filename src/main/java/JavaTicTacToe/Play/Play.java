package JavaTicTacToe.Play;

import JavaTicTacToe.Game.*;
import JavaTicTacToe.Output.*;

public class Play {

    public static void go(Output output){
        introduction(output);
        gameLoop(output);
    }

     public static void introduction(Output output) {
        output.welcomesPlayer();
        output.promptForInstructions();
    }

    public static void gameLoop(Output output){
        Game game = GameFactory.createGame(GameTypes.TWO_PLAYER, output);
        while (!game.gameOver()) {
            game.play();
        }
        if(game.playAgain()) {
            gameLoop(output);
        }
    }

}

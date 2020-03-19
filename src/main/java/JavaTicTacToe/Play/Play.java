package JavaTicTacToe.Play;

import JavaTicTacToe.Game.*;
import JavaTicTacToe.Output.*;

public class Play {

    public static void go(Output output){
        Game game = GameFactory.createGame(GameTypes.TWO_PLAYER, output);

        introduction(output);
        game.play();
    }

     public static void introduction(Output output) {
        output.welcomesPlayer();
        output.promptForInstructions();
    }


}

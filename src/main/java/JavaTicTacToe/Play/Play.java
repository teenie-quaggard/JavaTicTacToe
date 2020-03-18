package JavaTicTacToe.Play;

import JavaTicTacToe.Game.*;
import JavaTicTacToe.Output.*;

public class Play {

    public static void go(){
        Output output = OutputFactory.createOutput(OutputTypes.CONSOLE);
        Game game = GameFactory.createGame(GameTypes.TWO_PLAYER, output);

        introduction(output);
        game.play();
    }

    private static void introduction(Output output) {
        output.welcomesPlayer();
        output.promptForInstructions();
    }


}

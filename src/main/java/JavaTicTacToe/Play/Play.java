package JavaTicTacToe.Play;

import JavaTicTacToe.Game.*;
import JavaTicTacToe.Output.*;

public class Play {

    public static void go(){
        Output output = OutputFactory.createOutput(OutputTypes.CONSOLE);
        Game game = GameFactory.createGame(GameTypes.TWO_PLAYER, output);
        output.welcomesPlayer();
        output.gameInstructions();
        game.play();
    }
}

import Game.Game;
import Game.GameFactory;
import Game.GameTypes;
import Output.Output;
import Output.OutputFactory;
import Output.OutputTypes;

public class Main {
    public static void main(String[] args) {
        Output output = OutputFactory.createOutput(OutputTypes.CONSOLE);
        Game game = GameFactory.createGame(GameTypes.TWO_PLAYER, output);
        output.welcomesPlayer();
        game.play();
    }
}

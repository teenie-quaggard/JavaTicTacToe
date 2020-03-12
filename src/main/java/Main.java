public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe");
        Output output = OutputFactory.createOutput(OutputTypes.CONSOLE);
        output.responds();
        Game game = GameFactory.createGame(GameTypes.TWO_PLAYER);
        game.play();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe");
        Game game = GameFactory.createGame(GameTypes.TWO_PLAYER);
        game.play();
    }
}

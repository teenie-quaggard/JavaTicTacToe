package JavaTicTacToe.Game;

import JavaTicTacToe.Board.*;
import JavaTicTacToe.Output.*;
import JavaTicTacToe.Player.*;

public class GameTwoPlayer implements Game {

    Output output;
    Board board;
    Player currentPlayer;
    Player player1;
    Player player2;

    public GameTwoPlayer(Output output, Board board, Player player1, Player player2) {
        this.output = output;
        this.board = board;
        this.currentPlayer = player1;
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public void play() {

        System.out.println("You are playing the two player version of this game.");
        output.displaysBoard(board);
    }


}

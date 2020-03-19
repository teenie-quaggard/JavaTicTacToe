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

    turn();

    }

    public void turn(){
        output.promptTurn(currentPlayer.getMark());
        output.displaysBoard(board);
        currentPlayer.makeMove();
        // validate input
        // make move
    }


}

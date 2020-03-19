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
    boolean gameOver;
    boolean playAgain;

    public GameTwoPlayer(Output output, Board board, Player player1,
                         Player player2) {
        this.output = output;
        this.board = board;
        this.currentPlayer = player1;
        this.player1 = player1;
        this.player2 = player2;
        this.gameOver = false;
        this.playAgain = false;
    }

    @Override
    public void play() {

    while (!gameOver) {
        turn();
    }

    }

    @Override
    public void turn(){
        output.promptTurn(player());
        output.displaysBoard(board);
        String move = currentPlayer.makeMove();
        // needs validation here
        board.placeMove(player(), move);

        if (board.winningBoard(player())){
            gameOver = true;
            output.displaysBoard(board);
            output.congratulatesWinner(player());
            boolean input = output.playAgain();
            if (input) {
                playAgain = true;
            }
        } else if (board.tieBoard(player())) {
            gameOver = true;
            output.displaysBoard(board);
            output.tieGame();
            boolean input = output.playAgain();
            if (input) {
                playAgain = true;
            }
        } else {
            togglePlayer();
        }
    }

    @Override
    public void togglePlayer(){
      if (currentPlayer == player1){
          currentPlayer = player2;
      } else {
          currentPlayer = player1;
      }
    }

    @Override
    public boolean playAgain(){
        return playAgain;
    }

    @Override
    public boolean gameOver(){
        return gameOver;
    }

    private MarkerTypes player(){
        return currentPlayer.getMark();
    };
}

package JavaTicTacToe.Input;

import java.util.Scanner;

public class InputConsole {

    String getInput () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

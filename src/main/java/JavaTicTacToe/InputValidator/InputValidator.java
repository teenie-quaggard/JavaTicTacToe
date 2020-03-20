package JavaTicTacToe.InputValidator;

public class InputValidator {

    public static boolean yesOrNoValidation(String userInput){
        return userInput.matches("Y") || userInput.matches("N");
    }

    public static boolean integerRangeValidation(String userInput){
        return userInput.matches("[1-9]");
    }

}

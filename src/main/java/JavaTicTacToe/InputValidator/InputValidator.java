package JavaTicTacToe.InputValidator;

public class InputValidator {

    boolean yesOrNoValidation(String userInput){
        return userInput.matches("Y") || userInput.matches("N");
    }

    boolean integerRangeValidation(String userInput){
        return userInput.matches("[1-9]");
    }

}

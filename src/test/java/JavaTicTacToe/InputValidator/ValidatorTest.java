package JavaTicTacToe.InputValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorTest {

    @Test
    void yesNoValidatorOnlyAcceptsTheCharacters_Y_And_N_() {
        InputValidator validator = new InputValidator();

        assertTrue(validator.yesOrNoValidation("Y"));
        assertTrue(validator.yesOrNoValidation("N"));
        assertFalse(validator.yesOrNoValidation("n"));
        assertFalse(validator.yesOrNoValidation("y    9"));
        assertFalse(validator.yesOrNoValidation("adjf"));
    }

    @Test
    void integerRangeValidationOnlyAcceptsValidIntegers() {
        InputValidator validator = new InputValidator();

        assertTrue(validator.integerRangeValidation("1"));
        assertTrue(validator.integerRangeValidation("9"));
        assertFalse(validator.integerRangeValidation("99"));
        assertFalse(validator.integerRangeValidation("adf"));
    }
}
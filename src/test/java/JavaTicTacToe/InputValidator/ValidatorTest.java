package JavaTicTacToe.InputValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorTest {

    @Test
    void yesNoValidatorOnlyAcceptsTheCharacters_Y_And_N_() {

        assertTrue(InputValidator.yesOrNoValidation("Y"));
        assertTrue(InputValidator.yesOrNoValidation("N"));
        assertFalse(InputValidator.yesOrNoValidation("n"));
        assertFalse(InputValidator.yesOrNoValidation("y    9"));
        assertFalse(InputValidator.yesOrNoValidation("adjf"));
    }

    @Test
    void integerRangeValidationOnlyAcceptsValidIntegers() {

        assertTrue(InputValidator.integerRangeValidation("1"));
        assertTrue(InputValidator.integerRangeValidation("9"));
        assertFalse(InputValidator.integerRangeValidation("99"));
        assertFalse(InputValidator.integerRangeValidation("adf"));
    }
}
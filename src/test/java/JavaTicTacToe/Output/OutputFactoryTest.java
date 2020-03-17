package JavaTicTacToe.Output;

import JavaTicTacToe.Output.Output;
import JavaTicTacToe.Output.OutputConsole;
import JavaTicTacToe.Output.OutputFactory;
import JavaTicTacToe.Output.OutputTypes;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OutputFactoryTest {

    @Test
    void createOutputCreatesANewInstanceOfOutput() {
        Output outputConsole = OutputFactory.createOutput(OutputTypes.CONSOLE);
        assertThat(outputConsole, instanceOf(OutputConsole.class));
    }

    @Test
    void createOutputThrowsExceptionWhenPassedIncorrectOutputType(){
        Throwable exception = assertThrows(Throwable.class, () -> OutputFactory.createOutput(null));
        assertTrue(exception.getMessage().contains("Incorrect outputType passed into OutputFactory."));
    }

}
package JavaTicTacToe.Play;

import JavaTicTacToe.Output.Output;
import JavaTicTacToe.Output.OutputConsole;
import JavaTicTacToe.Output.OutputFactory;
import JavaTicTacToe.Output.OutputTypes;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

//class PlayTest {
//
//    @Test
//    void introductionPrintsWelcomeMessageAndPromptsRules() {
//
//        ByteArrayOutputStream output = new ByteArrayOutputStream();
//        PrintStream out = new PrintStream(output);
//        InputStream in = new ByteArrayInputStream("".getBytes());
//        OutputConsole console = new OutputConsole(out, in);
//
//        Play.introduction(console);
//
//        assertEquals("\n\n" +
//                "          _______  _        _______  _______  _______  _______   _________ _______ \n" +
//                "|\\     /|(  ____ \\( \\      (  ____ \\(  ___  )(       )(  ____ \\  \\__   __/(  ___  )\n" +
//                "| )   ( || (    \\/| (      | (    \\/| (   ) || () () || (    \\/     ) (   | (   ) |\n" +
//                "| | _ | || (__    | |      | |      | |   | || || || || (__         | |   | |   | |\n" +
//                "| |( )| ||  __)   | |      | |      | |   | || |(_)| ||  __)        | |   | |   | |\n" +
//                "| || || || (      | |      | |      | |   | || |   | || (           | |   | |   | |\n" +
//                "| () () || (____/\\| (____/\\| (____/\\| (___) || )   ( || (____/\\     | |   | (___) |\n" +
//                "(_______)(_______/(_______/(_______/(_______)|/     \\|(_______/     )_(   (_______)\n" +
//                "                                                    " +
//                "                               \n" +
//                "                                                      \n" +
//                "  *   )            *   )              *   )           \n" +
//                "` )  /( (        ` )  /(    )       ` )  /(       (   \n" +
//                " ( )(_)))\\   (    ( )(_))( /(   (    ( )(_))(    ))\\  \n" +
//                "(_(_())((_)  )\\  (_(_()) )(_))  )\\  (_(_()) )\\  /((_) \n" +
//                "|_   _| (_) ((_) |_   _|((_)_  ((_) |_   _|((_)(_))   \n" +
//                "  | |   | |/ _|    | |  / _` |/ _|    | | / _ \\/ -_)  \n" +
//                "  |_|   |_|\\__|    |_|  \\__,_|\\__|    |_| \\___/\\___|  \n" +
//                "                                                      \n\n\n" +
//                "\nWould you like to see the rules of the game? (Y/N):" +
//                "\n\n\n" +
//                "THE RULES:\n" +
//                "The object of Tic Tac Toe is to get three in a row. \n" +
//                "You'll be playing on a three by three game board grid. \n" +
//                "The first player will be known as 𝕏 and the second as 𝟘. \n" +
//                "Players alternate placing 𝕏s and 𝟘s on the game board \n" +
//                "until one opponent has three of their markers in a row or \n" +
//                "all nine squares are filled. 𝕏 always goes first, and in \n" +
//                "the event that no one has three in a row, the stalemate is " +
//                "\ncalled a cat game. Meow. 🐈\n\n", output.toString());
//    }
//}
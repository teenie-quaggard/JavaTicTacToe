package Output;

public class OutputFactory {
    public static Output createOutput(OutputTypes outputType) {
        if (outputType == OutputTypes.CONSOLE) {
            return new OutputConsole();
        } else {
            throw new Error("Incorrect outputType passed into OutputFactory.");
        }
    }
}

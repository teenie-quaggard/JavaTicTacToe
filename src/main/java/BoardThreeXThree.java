import java.util.Vector;

public class BoardThreeXThree implements Board {
    @Override
    public Vector availableSpaces() {
        return new Vector(9);
    }
}

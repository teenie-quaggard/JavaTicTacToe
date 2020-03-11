public class BoardFactory {
    public Board createBoard(BoardTypes boardTypes) {
        if (boardTypes == BoardTypes.THREE_X_THREE) {
            return new BoardThreeXThree();
        } else {
            return null;
        }
    }
}

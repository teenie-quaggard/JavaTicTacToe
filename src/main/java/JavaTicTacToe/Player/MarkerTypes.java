package JavaTicTacToe.Player;

public enum MarkerTypes {
    X ("X"),
    O ("𝟘");

    private String marker;

    @Override
    public String toString(){
        return marker;
    }

    MarkerTypes(String marker){
        this.marker = marker;
    }
}

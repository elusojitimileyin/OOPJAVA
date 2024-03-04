package TicTacToe;

public enum Players {
    X('X'),
    O ('O'),
    EMPTY('-');

    private final char entity;

    Players(char entity){
        this.entity = entity;
    }
public char getEntity(){
        return entity;
}
}

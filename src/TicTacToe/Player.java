package TicTacToe;

public class Player {
    public static final char EMPTY = ' ' ;
    private final String name;
    private final char entity;

    public Player(String name, char entity) {
        this.name = name;
        this.entity = entity;
    }
    public String getName(){
        return name;
    }
    public char getEntity(){
        return entity;
    }
}

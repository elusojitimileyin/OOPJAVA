package TicTacToe;

public class Players {

    public static final char X = 'X';
    public static final char O = 'O';

    public static final char EMPTY = '-';
    private final String name;
    private final char PlayersEnum;

    public Players(String name, char PlayersEnum) {
        this.name = name;
        this.PlayersEnum = PlayersEnum;
    }
    public String getName(){

        return name;
    }
    public char getCurrentPlayer(){

        return PlayersEnum;
    }



    public char getEntity() {
        return PlayersEnum;

    }
}
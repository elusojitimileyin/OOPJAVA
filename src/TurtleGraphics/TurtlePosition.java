package TurtleGraphics;

public class TurtlePosition {
    private int row;
    private int column;

    public TurtlePosition(int row,int column){
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof TurtlePosition position) {
            return row == position.row && column == position.column;
        }
        return false;
        }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}

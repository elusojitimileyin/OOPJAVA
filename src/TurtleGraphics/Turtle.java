package TurtleGraphics;

import static TurtleGraphics.Direction.*;

public class Turtle {
    private boolean isPenUp = true;
    private TurtlePosition currentPosition = new TurtlePosition(0,0);
    private Direction currentDirection = EAST;
    public boolean isPenUp() {
      return isPenUp ;
    }

    public boolean PenDown() {
        return isPenUp = false;
    }

    public void turnLeft() {
        currentDirection = currentDirection.turnLeft();

    }

    public Direction getCurrentDirection() {

        return currentDirection;
    }

    public void turnRight() {
        currentDirection = currentDirection.turnRight();
    }

    public TurtlePosition getCurrentPosition(){
        return currentPosition;
    }

    public void moveForward(int numberOfSteps, SketchBoard sketchBoard) {
        if (!isPenUp) drawOnBoard(sketchBoard,numberOfSteps);
        switch (currentDirection){
            case EAST -> moveForwardToEast(numberOfSteps);
            case SOUTH -> moveForwardToSouth(numberOfSteps);
            case WEST -> moveForwardToWest(numberOfSteps);
            case NORTH -> moveForwardToNorth(numberOfSteps);
        }
    }

    private void moveForwardToNorth(int numberOfSteps) {
        int newRow = numberOfSteps - currentPosition.getRow() - 1 ;
        int newColumn = currentPosition.getColumn();
        currentPosition = new TurtlePosition(newRow, newColumn);
    }

    private void moveForwardToWest(int numberOfSteps) {
        int newRow = currentPosition.getRow();
        int newColumn = numberOfSteps - currentPosition.getColumn() -1;
        currentPosition = new TurtlePosition(newRow,newColumn);
    }

    private void moveForwardToSouth(int numberOfSteps) {
        int newRow = currentPosition.getRow();
        int newColumn = numberOfSteps - currentPosition.getColumn() -1;
        currentPosition = new TurtlePosition(newRow,newColumn);
    }

    private void moveForwardToEast(int numberOfSteps) {
        int newRow = currentPosition.getRow();
        int newColumn = numberOfSteps - currentPosition.getColumn() -1;
        currentPosition = new TurtlePosition(newRow,newColumn);
        
    }

    private void drawOnBoard(SketchBoard sketchBoard, int numberOfSteps) {
        int [][] floorBoard = sketchBoard.getSketchBoard();

        switch (currentDirection) {
            case EAST:
                markEastWard(floorBoard, numberOfSteps);
                break;
            case SOUTH:
                markSouthWard(floorBoard, numberOfSteps);
                break;
            case WEST:
                markWestWard(floorBoard, numberOfSteps);
                break;
            case NORTH:
                markNorthWard(floorBoard, numberOfSteps);
                break;
        }
    }

    private void markNorthWard(int[][] floorBoard, int numberOfSteps) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        for (int columnCheck = 0; columnCheck < numberOfSteps; columnCheck++) {
            floorBoard[row - columnCheck][column] = 1;
        }
    }

    private void markWestWard(int[][] floorBoard, int numberOfSteps) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        for (int rowCheck = 0; rowCheck < numberOfSteps; rowCheck++) {
            floorBoard[row][column - rowCheck] = 1;
        }
    }

    private void markSouthWard(int[][] floorBoard, int numberOfSteps) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        for (int rowCheck = 0; rowCheck < numberOfSteps; rowCheck++) {
            floorBoard[row + rowCheck][column] = 1;
        }
    }

    private void markEastWard(int[][] floorBoard, int numberOfSteps) {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        for (int columnCheck = 0; columnCheck < numberOfSteps; columnCheck++) {
            floorBoard[row][column + columnCheck] = 1;
        }
    }


    public void penDown() {
        isPenUp = false;
    }
}

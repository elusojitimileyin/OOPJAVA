package TurtleGraphicsTest;

import TurtleGraphics.SketchBoard;
import TurtleGraphics.Turtle;
import TurtleGraphics.TurtlePosition;
import org.junit.jupiter.api.Test;

import static TurtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    @Test
    public void turtlePenIsUp(){
        Turtle turtle = new Turtle();
        turtle.isPenUp();
        assertTrue(turtle.isPenUp());
    }
    @Test
    public void turtlePenIsDown(){
        Turtle turtle = new Turtle();
        turtle.isPenUp();
        assertTrue(turtle.isPenUp());
        turtle.PenDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void testTurtlePenCanTurnLeftToEast(){
        Turtle turtle = new Turtle();
        assertSame(EAST, turtle.getCurrentDirection());
    }
    @Test
    public void testTurtlePenCanTurnLeftToNorth(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void testTurtlePenCanTurnLeftToWest(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(WEST, turtle.getCurrentDirection());
    }
    @Test
    public void testTurtlePenCanTurnLeftToSouth(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }


    @Test
    public void testTurtlePenCanTurnRightToSouth(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    public void testTurtlePenCanTurnRightToWest(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentDirection());
    }
    @Test
    public void testTurtlePenCanTurnRightToNorth(){
        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void testTurtleCanMoveRightEastToNorth() {
        Turtle turtle = new Turtle();
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0,0),turtle.getCurrentPosition());
    }
    @Test
    public void testTurtleCanMoveForward() {
        Turtle turtle = new Turtle();
        SketchBoard sketchBoard = new SketchBoard();
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0,0),turtle.getCurrentPosition());
        turtle.moveForward(5,sketchBoard);
        assertEquals(new TurtlePosition(0,4),turtle.getCurrentPosition());

    }

    @Test
    void testThatTurtleInitialPositionIsZeroAtRowAndZeroAtColumnWhenTurtleLocationIsEast() {
        Turtle turtle = new Turtle();
        SketchBoard sketchBoard = new SketchBoard();
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0, 0), turtle.getCurrentPosition());
    }

    @Test
    void testThatTurtleCanMoveWhenTurtleLocationIsEast() {
        Turtle turtle = new Turtle();
        SketchBoard sketchBoard = new SketchBoard();
        assertSame(EAST, turtle.getCurrentDirection());
        assertEquals(new TurtlePosition(0, 0), turtle.getCurrentPosition());

        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0, 4), turtle.getCurrentPosition());

    }
    @Test
    void testThatTurtleCanMoveWhenTurtleLocationIsSouth() {
        Turtle turtle = new Turtle();
        SketchBoard sketchBoard = new SketchBoard();

        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(0, 4), turtle.getCurrentPosition());


        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());
        turtle.moveForward(5, sketchBoard);
        assertEquals(new TurtlePosition(5, 4), turtle.getCurrentPosition());
    }

}
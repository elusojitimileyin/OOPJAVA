package TicTacToeTest;

import TicTacToe.TicTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void testForEmptyTicTacToe(){
        TicTacToe myTicTacToe = new TicTacToe();
        char[][] board = myTicTacToe.getBoard();

    }
    @Test
    void testForEmptyTicTacToe_makeOneMove(){
        TicTacToe myTicTacToe = new TicTacToe();
        myTicTacToe.getBoard();
        myTicTacToe.makeMove(0,2);

    }

//    @Test
//    void testForEmptyTicTacToe_makeWrongMove(){
//        TicTacToe myTicTacToe = new TicTacToe();
//        myTicTacToe.getBoard();
//        myTicTacToe.makeMove(3,2);
//        assertThrows(ArrayIndexOutOfBoundsException.class,()-> myTicTacToe.makeMove(3, 2));
//        assertTrue(myTicTacToe.checkForWin());
//    }
    @Test
    void testForEmptyTicTacToe_makeMultiplyMove(){
        TicTacToe myTicTacToe = new TicTacToe();
        myTicTacToe.getBoard();
        myTicTacToe.makeMove(0,2);
        myTicTacToe.makeMove(0,0);
        myTicTacToe.makeMove(0,1);
        myTicTacToe.makeMove(1,2);
        myTicTacToe.makeMove(1,1);
        myTicTacToe.makeMove(1,0);
        myTicTacToe.makeMove(2,0);
        myTicTacToe.makeMove(2,2);
        myTicTacToe.makeMove(2,1);
        assertEquals(true, myTicTacToe.checkForWin());

    }
}
package TicTacToeTest;

import TicTacToe.TicTacToe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {



    @Test
    void testForEmptyTicTacToe(){
        TicTacToe myTicTacToe = new TicTacToe();
        myTicTacToe.getBoard();

    }
    @Test
    void testForEmptyTicTacToe_makeMove(){
        TicTacToe myTicTacToe = new TicTacToe();
        myTicTacToe.getBoard();
        myTicTacToe.makeMove(0,2);

    }
}
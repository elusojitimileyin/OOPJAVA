package TicTacToe;

import Exceptions.BoardFilledException;
import Exceptions.NullPlayerException;

import javax.swing.*;
import java.awt.*;


public class TicTacToeApp {

    private final TicTacToe myGame;

    public TicTacToeApp() {
        myGame = new TicTacToe();
    }

    private static void print(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    public static void welcome() {
        print("Welcome To GameByOBANTU\n");
        print("The next page Displays, Shows And Help You With Your Choice ?\n");
    }

    public static void displayBoard(char[][] createBoard) {
        JFrame frame = new JFrame("Tic-Tac-Toe Board");
        JPanel panel = new JPanel(new GridLayout(3, 3));

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                JLabel label = new JLabel(String.valueOf(createBoard[row][column]));
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel.add(label);
            }
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void mainApp() {
        TicTacToeApp myTicTacToeApp = new TicTacToeApp();
        welcome();
        displayBoard(myTicTacToeApp.myGame.getBoard());

        while (myTicTacToeApp.myGame.getWinner() == ' ') {
            int row = -1;
            int column = -1;
            try {
                row = Integer.parseInt(input("Enter Row (0 - 2): "));
                column = Integer.parseInt(input("Enter Column (0 - 2): "));
                if (row < 0 || row > 2 || column < 0 || column > 2) {
                    print("Invalid input. Row and column values must be between 0 and 2.");
                    continue;
                }
                myTicTacToeApp.myGame.makeMove(row, column);
                displayBoard(myTicTacToeApp.myGame.getBoard());
            } catch (NumberFormatException e) {
                print("Invalid input. Please enter numeric values for row and column.");
            } catch (BoardFilledException e) {
                print("Cell at row " + row + ", column " + column + " is already occupied. Please try again.");
            } catch (NullPlayerException e) {
                print("Invalid player. Please ensure all players are set.");
            }
        }

        char winner = myTicTacToeApp.myGame.getWinner();
        if (winner != ' ') {
            print("Player " + winner + " wins!");
        } else {
            print("It's a draw!");
        }
    }

    public static void main(String[] args) {
        mainApp();
    }
}

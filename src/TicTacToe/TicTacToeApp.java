package TicTacToe;


import java.util.Scanner;


public class TicTacToeApp {

    private final TicTacToe myGame;

    public TicTacToeApp() {

        myGame = new TicTacToe();
    }



    private static final Scanner scanner = new Scanner(System.in);
    private static String input() {
       System.out.print("Enter Position (1 - 9): ");
        return scanner.nextLine();
   }

   private static void print(String prompt) {

        System.out.println(prompt);
   }


    public static void displayBoard(char[][] scoreBoard) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(" " + scoreBoard[row][column] + " ");
                if (column < 2) {
                    System.out.print("|");

                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("---------------------");

            }
        }
        System.out.println();
        System.out.println("=============");
    }
    public static void welcome() {
        print("Welcome To GameByOBANTU\n");
        print("The next page Displays, Shows And Help You With Your Choice ?\n");
    }



    public static void mainApp() {
        TicTacToeApp myTicTacToeApp = new TicTacToeApp();
        welcome();
        displayBoard(myTicTacToeApp.myGame.getBoard());

        while (myTicTacToeApp.myGame.getWinner() == ' ' && !myTicTacToeApp.myGame.isGameOver()) {
            int position = -1;
            try {
                position = Integer.parseInt(input()) - 1;
                if (position < 0 || position > 8) {
                    print("Invalid input. Position must be between 1 and 9.");
                    continue;
                }
                int row = position / 3;
                int col = position % 3;
                myTicTacToeApp.myGame.makeMove(row, col);
                displayBoard(myTicTacToeApp.myGame.getBoard());
            } catch (NumberFormatException e) {
                print("Invalid input. Please enter numeric values for position.");
            } catch (IllegalArgumentException e) {
                print(e.getMessage());
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

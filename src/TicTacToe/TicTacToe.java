package TicTacToe;

public class TicTacToe {
    private char[][] board;
    private Players currentPlayer;

    public TicTacToe(){
        board = new char[3][3];
        currentPlayer = Players.X;
        createBoard();
    }




    private  void createBoard() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++ ){
                board[i][j] =  '-';
            }
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public void makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '-') {
            return;
        }
        board[row][col] = currentPlayer.getEntity();
    }

    public boolean checkForWin() {
        return checkRows() || checkCols() || checkDiagonals();
    }

    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkCols() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        return (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]);
    }

    public void switchPlayer() {
        if (currentPlayer == Players.X) {
            currentPlayer = Players.O;
        } else {
            currentPlayer = Players.X;
        }
    }

    public Players getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean isGameOver() {
        return getWinner() != ' ' || checkDraw();
    }

    private boolean checkDraw() {
        for (char[] chars : board) {
            for (char aChar : chars) {
                if (aChar == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public char getWinner() {
        if (checkForWin()) {
            return currentPlayer.getEntity();
        }
        return ' ';
    }
}

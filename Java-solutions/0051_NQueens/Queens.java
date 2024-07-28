
import java.util.ArrayList;
import java.util.List;

/**
 * Queens
 */
public class Queens {

    List<List<String>> solveNQueens(int n) {
        List<List<String>> results = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        queens(board, 0, results);
        return results;
    }

    void queens(boolean[][] board, int row, List<List<String>> results){
        if (row == board.length) {
            results.add(display(board));
            return;
        }
        // placing the queen, and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                queens(board, row + 1, results);
                board[row][col] = false;
            }
        }
    }

    boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row-i][col-i]) {
                return false;
            }
        }

        //diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    List<String> display(boolean[][] board) {
        List<String> res = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                if (cell) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            res.add(sb.toString());
        }
        return res;
    }
}
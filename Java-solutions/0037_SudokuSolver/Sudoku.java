/**
 * Sudoku
 */
public class Sudoku {

    public static void main(String[] args) {
        char[][] board = new char[][]{
            {'3', '.', '6', '5', '.', '8', '4', '.', '.'},
            {'5', '2', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '8', '7', '.', '.', '.', '.', '3', '1'},
            {'.', '.', '3', '.', '1', '.', '.', '8', '.'},
            {'9', '.', '.', '8', '6', '3', '.', '.', '5'},
            {'.', '5', '.', '.', '9', '.', '6', '.', '.'},
            {'1', '3', '.', '.', '.', '.', '2', '5', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '7', '4'},
            {'.', '.', '5', '2', '.', '6', '3', '.', '.'}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }

    static void display(char[][] board) {
        for (char[] row : board) {
            for (char num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        // Find an empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            if (!emptyLeft) {
                break;
            }
        }

        // If no empty cell is found, the board is solved
        if (emptyLeft) {
            return true;
        }

        // Try placing numbers from '1' to '9' in the empty cell
        for (char num = '1'; num <= '9'; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, char num) {
        // Check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check the column
        for (char[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }

        // Check the 3x3 sub-grid
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
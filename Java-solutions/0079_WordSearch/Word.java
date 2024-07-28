/**
 * Word
 */
public class Word {

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCE";
        System.out.println(exist(board, word));
    }
    
    static boolean exist(char[][] matrix, String word) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == word.charAt(0) && helper(matrix, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean helper(char[][] matrix, String word, int row, int col, int index) {
        // if we've matched all characters in the word
        if (index == word.length()) {
            return true;
        }
        
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length 
            || matrix[row][col] != word.charAt(index)) {
            return false;
        }
        
        char temp = matrix[row][col];
        matrix[row][col] = ' ';
        
        boolean found = helper(matrix, word, row + 1, col, index + 1) ||
                        helper(matrix, word, row - 1, col, index + 1) ||
                        helper(matrix, word, row, col + 1, index + 1) ||
                        helper(matrix, word, row, col - 1, index + 1);
                        
        matrix[row][col] = temp;
        
        return found;
    }

}
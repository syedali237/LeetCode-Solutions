/**
 * Odd
 */
public class Odd {
    static int oddCells(int m, int n, int[][] indices) {
        // Create a matrix of size m x n initialized with zeros
        int[][] mat = new int[m][n];
        
        // Increment cells in the matrix based on indices
        for(int[] rc : indices) {
            // Increment row cells
            for(int i = 0; i < n; i++)
                mat[rc[0]][i]++;
            
            // Increment column cells
            for(int j = 0; j < m; j++)
                mat[j][rc[1]]++;
        }

        // Count the number of odd cells in the matrix
        int ans = 0;
        for(int[] arr : mat) {
            for(int ele : arr) {
                if(ele % 2 != 0) // If the cell value is odd
                    ans++; // Increment the answer count
            }
        }

        return ans; // Return the total count of odd cells
    }
}

// In the provided example indices = [[0,1],[1,1]],
// the variable rc represents each pair of 
// indices [row, column] within the indices array.

// For the first iteration of the loop:

// rc will be equal to [0,1].
// rc[0] will be 0, representing the row index.
// rc[1] will be 1, representing the column index.
// For the second iteration of the loop:

// rc will be equal to [1,1].
// rc[0] will be 1, representing the row index.
// rc[1] will be 1, representing the column index.
// So, in this example, during the first iteration, 
// rc[0] is 0 and rc[1] is 1, and 
// during the second iteration, rc[0] is 1 and rc[1] is 1.
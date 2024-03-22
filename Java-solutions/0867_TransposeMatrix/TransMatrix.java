/**
 * TransMatrix
 */
public class TransMatrix {

    static int[][] transpose(int[][] matrix) {
        int r = matrix.length; // row
        int c = matrix[0].length; // columns
        int[][] ans = new int[c][r];
        for (int i = 0 ;i<r;i++){
         for(int j=0; j<c ; j++){
             ans[j][i] = matrix[i][j];
             }
         }
         return ans;
     }
}
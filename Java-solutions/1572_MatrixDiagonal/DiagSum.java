/**
 * DiagSum
 */
public class DiagSum {

    static int diagonalSum(int[][] mat) {
        int ans = 0;
        int n = mat.length;
        for (int i=0; i< n; i++){
            ans += mat[i][i];
            ans += mat[i][n-1-i];
        }

        int odd = ans-mat[n/2][n/2];
        return (n%2==0) ? ans : odd;
    }
}
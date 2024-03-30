/**
 * Reshape
 */
public class Reshape {

    static int[][] matrixReshape(int[][] mat, int r, int c){
        int[][] s = new int[r][c];
        int x = 0;
        int y = 0;
        if(mat.length * mat[0].length == r * c){
            for(int i =0; i<mat.length; i++){
                for(int j = 0; j<mat[0].length; j++){
                    if(y==c){
                        x++;
                        y = 0;
                    }
                    s[x][y] = mat[i][j];
                    y++;
                }
            }
            return s;
        }
        return mat;
    }
}
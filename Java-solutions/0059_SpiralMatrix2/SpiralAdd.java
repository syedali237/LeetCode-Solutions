/**
 * SpiralAdd
 */
public class SpiralAdd {

    static int[][] generateMatrix(int m) {
        int n=m;//rows //columns
          int left=0;
          int right=n-1;
          int top=0;
          int bottom=n-1;
          int val = 1;
          int[][] list = new int[n][n];
          while(top<=bottom && left<=right)
          {
              for(int i=left;i<=right;i++){
                  list[top][i] = val++;
              }
              top++;
              for(int i=top;i<=bottom;i++){
                  list[i][right] = val++;
              }
              right--;
  
              if(top<=bottom){
              for(int i=right;i>=left;i--){
                  list[bottom][i] = val++;
              }
              bottom--;
              }
  
              if(left<=right)
              {
              for(int i=bottom;i>=top;i--)
              list[i][left] = val++;
              left++;
              }
          }
          return list;   
      }
}
/**
 * Flip
 */
public class Flip {
    public static void main(String[] args) {
        
    }
    
    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            // reverse this array
            for (int i = 0; i < (image[0].length +1)/2; i++) {
                // swap
                int temp = row[i] ^ 1; // xor with 1
                row[i] = row[image[0].length - i -1] ^ 1;
                row[image[0].length - i -1] = temp;
            }
        }
        return image;
    }

    static int[][] flipAndInvertImage2(int[][] image) { // using extra space
        int [][] rev = new int[image[0].length][image.length];
        for(int i=0; i<image.length; i++){
            int k=0;
            for(int j=image[i].length-1; j>=0; j--){
                rev[i][k++] = image[i][j];
            }
        }
        for(int i=0; i<rev.length; i++){
            for(int j=0; j<rev[i].length; j++){
                if(rev[i][j]==1) rev[i][j]=0;
                else if(rev[i][j]==0) rev[i][j]=1;
            }
        }
        return rev;
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal
 */
public class Pascal {

    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(generate2(5));
        System.out.println(generateRow(3));
        getRow(5);
    }

    //Generating Row from row index = 0 PASCAL 2
    static List<Integer> getRow(int rowIndex) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add((int) ans);
        for (int col = 1; col <= rowIndex; col++) {
            ans = ans * (rowIndex - col + 1);
            ans = ans / col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }


    // Optimized Solution
    static  List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            result.add(generateRow(i));
        }
        return result;
    }

    // this prints if row = 3 it gives index 2
    static List<Integer> generateRow(int row){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.addLast(1);
        for (int col = 1 ; col < row ; col++){
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add(ans);
        }
        return ansRow;
    }


    // Brute force approach with formula
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add((int) NCR(i, j));
            }
            triangle.add(row);
        }
        
        return triangle;
    }
    static long NCR(int n, int r){
        long res = 1;
        for(int i = 0; i < r; i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}
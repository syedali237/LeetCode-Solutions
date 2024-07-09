import java.util.Arrays;
/**
 * RightInterval
 */
public class RightInterval {

    public static void main(String[] args) {
        int[][] intervals = {{3,4},{2,3},{1,2}};
        int[] result = findRightInterval(intervals);
        System.out.println(Arrays.toString(result));
    }
    // 432ms runtime
    static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];

        for (int i = 0 ; i<intervals.length; i++){
            int value = Integer.MAX_VALUE;
            int index = -1;
            for(int j = 0; j < intervals.length ; j++){
                if(intervals[j][0] >= intervals[i][1]){
                    if (intervals[j][0] < value) {
                        value = intervals[j][0];
                        index = j;
                    }
                }
            }
            ans[i] = index;
        }
        return ans;
    }
}
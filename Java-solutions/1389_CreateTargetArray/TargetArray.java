import java.util.ArrayList;

/**
 * TargetArray
 */
public class TargetArray {
    public static void main(String[] args) {
        
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        ArrayList<Integer> targetList = new ArrayList<>();
        for(int i = 0 ;i < n ; i++){
            targetList.add(index[i] , nums[i]);
        }
        for (int i = 0 ; i < n ; i++){
            target[i] = targetList.get(i);
        }
        return target;
    }
}
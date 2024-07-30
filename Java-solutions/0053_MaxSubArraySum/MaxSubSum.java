
import java.util.ArrayList;
import java.util.List;

/**
 * MaxSubSum
 */
public class MaxSubSum {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArrayPrint(nums));
    }

    // printing the subarray with maxSum
    static List<Integer> maxSubArrayPrint(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0; 
        int arrS = -1 , arrE = -1;
        for(int i = 0; i < nums.length; i++){
            if(sum == 0) {
                start = i;
            }
            sum += nums[i];

            if(sum > maxSum){
                maxSum = sum;
                arrS = start;
                arrE = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        for (int i = arrS; i <= arrE; i++) {
            ans.add(nums[i]);
        }

        return ans;
    }

    // KADANES ALGO : BOTH METHODS
    int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum > maxSum){
                maxSum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }

    int maxSubArray2(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    
    }
}
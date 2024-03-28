/**
 * TwoSumSort
 */
public class TwoSumSort {

    static int[] twoSum(int[] nums, int target) {
        int start = 0, end =nums.length -1;
        while(start < end){
            if(nums[start] + nums[end] == target){
                return new int[]{start+1,end+1};
            } else if (nums[start] + nums[end] > target){
                end--;
            } else {
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
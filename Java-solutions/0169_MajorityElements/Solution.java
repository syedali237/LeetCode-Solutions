import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
int n = nums.length;
return nums[n/2];
}
    

public static void main(String[] args) {
        Solution solution = new Solution();
        int number[] = {3,2,3};
        int result = solution.majorityElement(number);
        System.out.println(result);
    }
}
/**
 * TargetSumPlusMin
 */
public class TargetSumPlusMin {

    // ONE WAY
    int findTargetSumWays(int[] nums, int target) {
        solve(0,0, target, nums);
        return ans;
    }

    int ans = 0;
    void solve(int index, int res , int target, int[] nums){
        if (index == nums.length){
            if(res == target){
                ans++;
            }
            return;
        }
        solve(index+1, res + nums[index], target,nums);
        solve(index+1, res - nums[index], target,nums);
    }
    

    //PASSING IN THE ARGUMENT
    int findTargetSumWays2(int[] nums, int target) {
        return solve(0, 0, target, nums, 0);
    }

    int solve(int index, int res, int target, int[] nums, int ans) {
        if (index == nums.length) {
            if (res == target) {
                return ans + 1;
            }
            return ans;
        }
        ans = solve(index + 1, res + nums[index], target, nums, ans);
        ans = solve(index + 1, res - nums[index], target, nums, ans);
        return ans;
    }
}
/**
 * ProductExcept
 */
public class ProductExcept {
    // if the count of zeros are 1, which means output of each non-zero element of the nums array in the ans array will be equal to 0 (zero). And output of 
    // the one and only zero element of the nums array in the ans array will be equal to product.
    // if the count of zeros are 0, which means all the elements in the nums array are non-zero and output of each element of the nums array in the ans array will be equal to product / nums[i].
    // if the count of zeros are 2 or more than 2, which means output of all the elements of the nums array in the ans array will be equal to 0.

    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n]; 
        int product = 1;
        int zeroes = 0;
        for(int num : nums){
            if(num == 0){
                zeroes++;
                continue;
            }
            product *= num;
        }
        // If there are two or more zeroes, all elements will be zero except at zero positions
        if (zeroes >= 2) { 
            return ans;
        }

        if(zeroes == 1){
            for(int i = 0; i<n ; i++){
                if(nums[i] == 0){
                    ans[i] = product;
                }else {
                    ans[i] = 0;
                }
            }
        } else {
             for(int i = 0; i<n ; i++){
                ans[i] = product / nums[i];
            }
        }
        return ans;
    }
}
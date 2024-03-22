/**
 * SplitArray
 */
public class SplitArray {

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i=0; i<nums.length;i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start<end) {
            int mid = start + (end-start)/2;
            int pieces =1 ;
            int sum = 0;
            for(int i=0 ; i<nums.length ;i++){
                if (sum + nums[i] > mid) {
                    // if the subarray sum exceeds the mid largest sum
                    // so new subarray sum
                    sum = nums[i];
                    pieces++;
                } else {
                    sum += nums[i];
                }
            }

            if (pieces > k) {
                start = mid + 1; 
            } else {
                end = mid;
            }
        }
        return end; //start = end
    }
} 
import java.util.Arrays;

public class FirstAndLast {

    // BRUTE FORCE
    static int[] searchRange(int[] nums, int target) {
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i] == target){
                for (int j = nums.length-1 ; j >= 0 ; j--){
                    if(nums[j] == target){
                        return new int[] {i,j};
                    }
                }
            }
        }
    return new int[] {-1,-1};
    }

    public int[] range(int[] nums, int target){
        int[] ans = {-1,-1};
        // check for first occurence
        ans[0] = search(nums, target , true);
        // end occurence
        ans[1] = search(nums, target, false);

        return ans;
    }

    int search(int[] nums, int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<= end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid - 1;
             } else if (target > nums[mid]){
                start = mid +1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,10};
       int target = 8;
       int[] result = searchRange(nums, target);
       System.out.println(Arrays.toString(result));
    }
}
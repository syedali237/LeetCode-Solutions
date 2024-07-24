
import java.util.Arrays;

/**
 * NextPerm
 */
public class NextPerm {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // nextPermutation(arr);
        nextPermutation2(arr);
        System.out.println(Arrays.toString(arr));
    }
    // two approaches

    static void nextPermutation2(int[] nums){
        int index = -1;
        int n = nums.length;

        for (int i = n-2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverse(nums, 0, n-1);
        }

        for (int i = n-1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        reverse(nums, index+1, n-1);
    }

    static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        
        // first pair from the right where nums[i] < nums[i+1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            // finding smallest number on the right side of i that is greater than nums[i]
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1); 
    }
    
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
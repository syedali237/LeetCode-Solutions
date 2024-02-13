import java.util.Arrays;

public class MajorityEl {
    static int majorityElement(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

    public int majorityEl(int[] nums) {
        int count = 0;
        int element = 0;

        for (int num : nums) {
            if (count == 0) {
                element = num;
                count = 1;
            } else if (element == num) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
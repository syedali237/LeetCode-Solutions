import java.util.Arrays;

public class Major {
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
int n = nums.length;
return nums[n/2];
}
    

public static void main(String[] args) {
        int number[] = {3,2,3};
        int result = majorityElement(number);
        System.out.println(result);
    }
}
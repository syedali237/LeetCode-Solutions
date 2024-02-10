public class RemoveSort {
    static int removeDuplicates(int[] nums) {
        int uniqueCursor = 1;
	for (int i = 1; i < nums.length; i++) {
		if (nums[i] != nums[i - 1]) {
			nums[uniqueCursor] = nums[i];
			uniqueCursor++;
		}
	}
	return uniqueCursor;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
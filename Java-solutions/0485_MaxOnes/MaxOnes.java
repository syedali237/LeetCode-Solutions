public class MaxOnes {
    static int maxConsecutiveOnes(int[] nums){
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i<nums.length ;i++){
            if (nums[i] == 1) count++;
            else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(maxConsecutiveOnes(nums));
    }
}
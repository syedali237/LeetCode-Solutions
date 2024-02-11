import java.util.Arrays;

public class FirstAndLast {
    int[] searchRange(int[] nums, int target) {
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
    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,10};
       int target = 8;
       FirstAndLast FirstAndLast = new FirstAndLast();
       int[] result = FirstAndLast.searchRange(nums, target);
       System.out.println(Arrays.toString(result));
    }
}
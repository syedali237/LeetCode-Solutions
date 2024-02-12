import java.util.Arrays;

public class Move {
    static int[] moveZeroes(int[] nums){
        int snowBallSize = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                snowBallSize++; 
            }
            else if (snowBallSize > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-snowBallSize]=t;
            }
        }
        return nums;
    }

    public void moveZero(int[] nums) {
        int k=0,j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
             nums[j]=nums[i];
             j++;
            }
            
        }
        for(k=j;k<nums.length;k++){
          nums[k]=0;
}
    }

    static int[] move(int[] nums){
        // finding first zero
        int j = -1;
        for (int i = 0 ; i<nums.length ; i++){
            if (nums[i] == 0){
                j=i;
                break;
            }
        }
        // if no zeroes
        if (j == -1) return nums;

        // swapping the non-zero with zero using two pointer approach
        for (int i =j+1; i<nums.length ; i++){
            if (nums[i] != 0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] result = move(nums);
        System.out.println(Arrays.toString(result));        
    }
}
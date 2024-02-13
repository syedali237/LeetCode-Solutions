public class Search {
    static int search(int[] nums, int target) {
        int count = 0 ;
        for(int i =0 ; i <nums.length ; i++){
            if (nums[i] == target){
               return count; 
            } else {
                count++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
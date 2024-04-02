import java.util.Arrays;

/**
 * Rota
 */
public class Rota {

    static boolean search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target) return true;
        }
        return false;
    }


    // USING BINARY SEARCH
    boolean search2(int[] nums, int target) {
        int pivot = findPivot(nums);
       if (pivot == -1) {
           Arrays.sort(nums);
           return binarySearch(nums, target, 0, nums.length-1);
       }

         if (nums[pivot] == target) {
           return true;
       }

       if (target >= nums[0]) {
           return binarySearch(nums, target, 0, pivot-1);
       }

       return binarySearch(nums, target, pivot+1, nums.length-1);
   }

   int findPivot(int[] nums){
       int start = 0, end = nums.length -1 ;
       // 4 cases here
       while (start <= end) {
           int mid = start + (end - start) / 2;
           // 4 cases over here
           if (mid < end && nums[mid] > nums[mid + 1]) {
               return mid;
           }
           if (mid > start && nums[mid] < nums[mid - 1]) {
               return mid-1;
           }
           if (nums[mid] <= nums[start]) {
               end = mid - 1;
           } else {
               start = mid + 1;
           }
       }
       return -1;
   }

   boolean binarySearch(int[] nums , int target, int start, int end){
       while (start <= end) {
           int mid = start + (end-start) / 2;
           if (target < nums[mid]) {
               end = mid -1 ;    
           } else if (target > nums[mid]) {
               start = mid + 1;
           } else {
               return true;
           }
       }
       return false;
   }
}
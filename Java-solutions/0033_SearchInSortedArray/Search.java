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

    //<---------------------------->
    
    //binary search
    static int search2(int[] nums, int target, int start, int end){
        int pivot = findPivot(nums);
        // if no pivot , it means arr is not rotated
        if (pivot == -1) {
            // normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }

        // if pivot is found
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);

    }

    // this will not cover duplicate values
    static int findPivot(int[] nums){
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

    static int binarySearch(int[] nums , int target, int start, int end){
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (target < nums[mid]) {
                end = mid -1 ;    
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //------------------------->

    static int findPivoWithDuplicates(int[] nums){
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

            // if elements at middle, start, end are eual
            // just skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // skip the duplicates
                // NOTE : WHAT IS START OR END IS PIVOT
                // check whether start is pivot
                if (nums[start] > nums[start+1]) {
                    return start;
                }
                start++;

                if (nums[end-1] > nums[end]) {
                    return end-1;
                }
                end--;
            } 
            // left side is sorted so pivot should be right
            else if(nums[start] < nums[mid] || 
            (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid + 1;
            } else {
                end = mid -1;
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
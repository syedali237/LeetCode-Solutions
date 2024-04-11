/**
 * MissNum
 */
public class MissNum {

    static int missingNumber(int[] arr){
        cycleSort(nums);
        for(int i = 0; i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    static void cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr , i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    

    // using hashet : extra space
    static int missingNumber2(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
       
       for (int num : nums) {
           numSet.add(num);
       }
       for (int i = 0; i <= nums.length; i++) {
           if (!numSet.contains(i)) {
               return i;
           }
       }
       return -1;
   }
}
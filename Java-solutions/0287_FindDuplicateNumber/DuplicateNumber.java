import java.util.HashSet;
import java.util.Set;

/**
 * DuplicateNumber
 */
public class DuplicateNumber {

    // using cycle Sort
    static int findDuplicate1(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // using Hashset can be done use linear search
    static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
      for(int i=0;i<nums.length;i++) {
          if(set.contains(nums[i])) return nums[i];
          set.add(nums[i]);
      }
      return -1;
  }

  // using boolean
  static int findDuplicate2(int[] nums) {
  boolean res[]= new boolean[nums.length+1];
    for(int i: nums){
        if(res[i]==false)res[i]=true;
        else return i;
    }
    return -1;
}
}
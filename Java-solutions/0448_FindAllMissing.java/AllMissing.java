import java.util.ArrayList;
import java.util.List;

/**
 * AllMissing
 */
public class AllMissing {
        static List<Integer> findDisappearedNumbers(int[] nums) {
            cycleSort(nums);
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index+1) {
                    ans.add(index + 1);
                }
            }
    
            return ans;
        }
    
        static void cycleSort(int[] arr){
            int i = 0;
            while (i < arr.length) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
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
}
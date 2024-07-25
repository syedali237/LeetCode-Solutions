
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CountSmall
 */
public class CountSmall {

    public static void main(String[] args) {
        int[] nums = {5,2,6,1};
        // int[] nums = {-1,-1};
        System.out.println(countSmaller(nums));
    }

    static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int[] indices = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        mergeSort(indices, 0, n - 1, nums, result);
        List<Integer> list = new ArrayList<>();
        for (int count : result){
            list.add(count);
        }
        return list;
    }

    static void mergeSort(int[] indices, int start, int end, int[] nums, int[] result){
        if (start >= end) {
            return;
        }
        int mid = start + (end - start)/2;

        mergeSort(indices, start, mid, nums, result);
        mergeSort(indices, mid +1 , end, nums, result);
        merge(indices, start, end, mid, nums, result);
    }

    static void merge(int[] indices, int start, int end, int mid, int[] nums, int[] result){
        int[] left = Arrays.copyOfRange(indices, start, mid + 1);
        int[] right = Arrays.copyOfRange(indices, mid + 1, end+1);

        int i = 0;
        int j = 0;
        int k = start;
        int rightCount = 0; // keeps a track of when right array elements are placed first
        // i.e that element is smallet than the current one

        while ( i < left.length && j < right.length){
            if (nums[left[i]] <= nums[right[j]]) {
                result[left[i]] += rightCount;
                indices[k] = left[i];
                i++;
            } else {
                rightCount++;
                indices[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            result[left[i]] += rightCount;
            indices[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            indices[k] = right[j];
            j++;
            k++;
        }
    }

    static List<Integer> countSmallerTLE(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }
}
import java.util.Arrays;

/**
 * MergeArrays
 */
public class MergeArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));

    }

    static void merge(int[] first, int m, int[] second, int n) {
        int[] arr = mergeArrays(first, m, second, n);
        for(int i = 0; i < m + n ; i++){
            first[i] = arr[i];
        }
    }

    static int[] mergeArrays(int[] first, int m, int[] second, int n) {
        int[] mix = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < n) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
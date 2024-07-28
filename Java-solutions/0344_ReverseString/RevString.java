
import java.util.Arrays;

/**
 * RevString
 */
public class RevString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    static void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(char[] arr, int left, int right){
        if(left >= right){
            return;
        }
        swap(arr, left, right);
        reverse(arr, left + 1, right - 1);
    }
}
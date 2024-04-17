import java.util.Arrays;

/**
 * OddString
 */
public class OddString {
    
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }

    static String largestOddNumber(String num) {
        int end = num.length() - 1;
        while (end >= 0 && (num.charAt(end) - '0') % 2 == 0) { 
            end--;
        }
        return num.substring(0, end + 1);
    }
}
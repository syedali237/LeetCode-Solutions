/**
 * StringInt
 */
public class StringInt {

    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(myAtoi(s));
    }

    static int myAtoi(String s) {
        int len = s.length();
        int index = 0;

        if (index == len) {
            return 0;
        }

        while (index < len && s.charAt(index) == ' ') {
            index++;
        }
        boolean isNegative = false;
        if (index < len) {
            if (s.charAt(index) == '-') {
                isNegative = true;
                index++;
            } else if (s.charAt(index) == '+') {
                index++;
            } 
        }

        int result = 0;
        int maxDiv10 = Integer.MAX_VALUE / 10;

        while (index < len && isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            if (result > maxDiv10 || (result == maxDiv10 && digit > 7)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = (result * 10) + digit;
            index++;
        }

        return isNegative ? -result : result;
    }

    static boolean isDigit(char ch){
        return ch >= '0' && ch <= '9';
    }
}
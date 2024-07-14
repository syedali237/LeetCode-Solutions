/**
 * ReverseInt
 */
public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    static int reverse(int x) {
        int num = Math.abs(x);
        int rev = 0;
        while(num != 0){
            int lastDigit = num % 10;

            if (rev > (Integer.MAX_VALUE - lastDigit) / 10) {
                return 0;
            }
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        if(x < 0){
            return -rev;
        } else {
            return rev;
        }
    }
}
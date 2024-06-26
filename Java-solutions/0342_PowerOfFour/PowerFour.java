/**
 * PowerFour
 */
public class PowerFour {

    public static void main(String[] args) {
        System.out.println(powerFour(64));
    }

    static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        return ((n & (n-1)) == 0) && ((n & 0x55555555) != 0);
    }

    static boolean PowerOfFour(int n){

        if (n <= 0) {
        return false;}

        // 4^2 = 16 => 2 = log(16)/log(4) => should be an integer 
        // therefore % 1 
        
        return Math.log(n) / Math.log(4) % 1 == 0;  
    }

    static boolean powerFour(int n){
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }
        return true;
    }
}
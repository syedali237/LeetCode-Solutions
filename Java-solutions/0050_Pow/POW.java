/**
 * POW
 */
public class POW {
    public static void main(String[] args) {
        System.out.println(myPow(2, 3));
    }

    static double myPow(double base, int pow) {
        if (pow == 0) return 1; // Any number to the power of 0 is 1
        if (pow == 1) return base; // Any number to the power of 1 is itself

        // Handle negative powers
        long exp = pow;
        if (pow < 0) {
            base = 1 / base;
            exp = -exp; // Convert pow to positive
        }

        double ans = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans *= base;
            }
            base *= base;
            exp >>= 1; // Equivalent to exp = exp / 2
        }
        
        return ans;
    }
}
/**
 * SQRTn
 */
public class SQRTn {

    public static void main(String[] args) {
        System.out.println(mySqrt(36));
    }

    static int mySqrt(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int s = 0;
        int e = n;

        while (s <= e) {
            int m = s + (e-s)/2;
            if (m * m == n) {
                return m;
            }

            if ((long) m*m >(long) n) {
                e = m-1;
            } else {
                s = m + 1;
            }
        }

        return Math.round(e);
    }
}
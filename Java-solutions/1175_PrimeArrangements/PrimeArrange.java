import java.math.BigInteger;

/**
 * PrimeArrange
 */
public class PrimeArrange {

    static int MOD = 1000000007;

    public int numPrimeArrangements(int n) {
        int noOfPrime = sieve(n);
        BigInteger x = factorial(noOfPrime);
        BigInteger y = factorial(n - noOfPrime);
        return x.multiply(y).mod(BigInteger.valueOf(MOD)).intValue();
    }

    // number of Primes
    int sieve(int n){
        boolean[] prime = new boolean[n+1];
        // false in array means prime number
        for (int i = 2; i*i <= n; i++) {
            if (!prime[i]) {
                for (int j = 2*i ; j <= n; j+=i){
                    prime[j] = true;
                }
            }
        }
        int cnt = 0;
        for (int i = 2; i < prime.length; i++)
            if (!prime[i])
               cnt++;
        return cnt;
    }

    BigInteger factorial(int n) {
        BigInteger fac = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac.mod(BigInteger.valueOf(MOD));
    }
}
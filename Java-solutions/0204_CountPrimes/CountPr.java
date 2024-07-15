/**
 * CountPr
 */
public class CountPr {
    public static void main(String[] args) {
        countPrimes(20);
    }

    static int countPrimes(int n) {
        if(n <= 2) return 0;
        boolean[] primes = new boolean[n+1];
        return sieve(n,primes);
    }

    static int sieve(int n, boolean[] prime){
        int count = 0;
        for (int i = 2; i*i <= n; i++) {
            if (!prime[i]) {
                for (int j = i*2 ; j <= n; j+=i){
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (!prime[i]) {
                count++;
            }
        }
        return count;
    }
}
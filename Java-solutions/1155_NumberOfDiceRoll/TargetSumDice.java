/**
 * TargetSumDice
 */
public class TargetSumDice {

    private static final int MOD = 1000000007;
    
    public int numRollsToTarget(int n, int k, int target) {
        Integer[][] memo = new Integer[n + 1][target + 1];
        return dice(n, k, target, memo);
    }
    
    private int dice(int noOfDice, int face, int target, Integer[][] memo) {
        if (target < 0) {
            return 0;
        }
        if (noOfDice == 0) {
            return target == 0 ? 1 : 0;
        }
        if (memo[noOfDice][target] != null) {
            return memo[noOfDice][target];
        }
        
        long count = 0;
        for (int i = 1; i <= face && i <= target; i++) {
            count = (count + dice(noOfDice - 1, face, target - i, memo)) % MOD;
        }
        
        memo[noOfDice][target] = (int) count;
        return memo[noOfDice][target];
    }
}
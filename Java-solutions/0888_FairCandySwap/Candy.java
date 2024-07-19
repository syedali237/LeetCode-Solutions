import java.util.HashSet;
import java.util.Set;

/**
 * Candy
 */
public class Candy {

    int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;

        for(int candies : aliceSizes) aliceTotal += candies;
        for(int candies : bobSizes) bobTotal += candies;

        int m = aliceSizes.length, n = bobSizes.length;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if ((aliceTotal - aliceSizes[i] + bobSizes[j]) == (bobTotal - bobSizes[j] + aliceSizes[i]))
                return new int[] { aliceSizes[i], bobSizes[j] };

            }
        }
        return new int[0];
    }

    int[] fairCandySwap2(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;

        for (int candies : aliceSizes) aliceTotal += candies;
        for (int candies : bobSizes) bobTotal += candies;

        int delta = (bobTotal - aliceTotal) / 2;
        Set<Integer> bobSet = new HashSet<>();
        for (int size : bobSizes) {
            bobSet.add(size);
        }

        for (int size : aliceSizes) {
            if (bobSet.contains(size + delta)) {
                return new int[]{size, size + delta};
            }
        }
        return new int[0];
    }
}
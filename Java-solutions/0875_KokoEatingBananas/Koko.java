/**
 * Koko
 */
public class Koko {

    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = max(piles);
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long total_hours = totalHours(piles, mid);

            if (total_hours <= h) {
                ans = mid;      
                end = mid - 1;  
            } else {
                start = mid + 1;
            }
        } 

        return ans;
    }

    long totalHours(int[] arr , int hours) {
        long totalHours = 0;
        for (int pile : arr) {
                totalHours += (pile + hours - 1) / hours; // Ceil
        }
        return totalHours;
    }

    int max(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // giving TLE
    static int minEatingSpeed2(int[] piles, int h) {
        // brute force
       int k = 1;
        while (true) {
            int totalHours = 0;

            for (int pile : piles) {
                totalHours += (pile + k - 1) / k; // Calculate the ceiling of pile / k
                if (totalHours > h) {
                    break; 
                }
            }
            if (totalHours <= h) {
                return k;
            }
            k++;
        }
    }


}
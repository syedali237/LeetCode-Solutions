/**
 * Mountain
 */

 interface MountainArray {
    public int get(int index);
    public int length();
}

public class Mountain {

    static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    static int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0, end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                // You are in the decreasing part of the array
                // This may be the peak, but look at the left side
                end = mid;
            } else {
                // You are in the ascending part
                // Check for the right side because mid + 1 > mid; ignore mid
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(MountainArray mountainArr, int target, int start, int end) {
        // Find out if the sorted array is ascending or descending
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midElement = mountainArr.get(mid);

            if (midElement == target) {
                return mid;
            }

            if (isAsc) {
                if (target < midElement) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midElement) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
/**
 * Peak
 */
public class Peak {

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0 , end = arr.length - 1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in dec part of array
                // this may be ans, but look at left side
                end = mid;
            } else {
                // you are in ascending part
                // check for right side
                // bcoz mid +1 > mid ; ignore mid
                start = mid + 1;
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }

    // using Linear Search
    static int peakindex(int[] arr){
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
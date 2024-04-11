/**
 * SortSquare
 */
public class SortSquare {

    static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0 ;i< nums.length ; i++){
         ans[i] = nums[i]*nums[i];
        }
        bubbleSort(ans);
        return ans;
     }
 
    static void bubbleSort(int[] arr){
         boolean swapped;
         // run the steps n-1 times
         for(int i = 0; i<arr.length;i++){
             swapped = false;
             // for each step, max item will come at the last respective index
             for (int j = 1; j < arr.length - i; j++) {
                 // swap if the item is smaller than prev one
                 if (arr[j] < arr[j-1]) {
                     // swap
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                     swapped = true;
                 }
             }
             if (!swapped) { // !false = true
                 break;
             }
         }
     }
}
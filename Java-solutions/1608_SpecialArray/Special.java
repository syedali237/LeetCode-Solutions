/**
 * Special
 */
public class Special {

    public static void main(String[] args) {
        int[] nums ={0,4,3,0,4};
        System.out.println(specialArray(nums)); 
    }


        static int specialArray(int[] nums) {
            bubbleSort(nums);
            int result = binarySearch(nums);
            return result;
        }
    
        static int binarySearch(int[] nums){
           int s = 0;
           int e = nums.length;
    
           while(s <= e){
            int mid = s + (e-s)/2;
            int ans = count(nums, mid);
    
            if(ans == mid) return mid;
            else if(ans > mid) s = mid + 1;
            else e = mid - 1;
           } 
           return -1;
        }
    
        static int count(int []nums, int target){
                int ans = 0;
                for(int num : nums){
                    if(num>=target) ans++;
                    
                }
            return ans;
        }
    
        static void bubbleSort(int[] arr){
            boolean swapped;
            for(int i = 0; i<arr.length;i++){
                swapped = false;
                for (int j = 1; j < arr.length - i; j++) {
                    if (arr[j] < arr[j-1]) {
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped) { 
                    break;
                }
            }
        }
}
import java.util.Arrays;

/**
 * Check
 */
public class Check {

    static boolean checkExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i<arr.length ; i++){
        int start = 0, end = arr.length - 1;
        int x = 2*arr[i];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid != i && arr[mid] == x){
                return true;
            } else if (arr[mid] < x){
                start = mid+1;
            } else {
                end =mid -1;
            }
        }
        }
        return false;
    }

    // OR 
    static boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            // System.out.println(search(arr,arr[i]*2,i)+" "+arr[i]*2);
            if(search(arr,arr[i]*2,i))
                return true;
        }
        return false;
    }
    
    static Boolean search(int[] arr,int value,int index){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value && i!=index)
                return true;
        }
        return false;
    }
}
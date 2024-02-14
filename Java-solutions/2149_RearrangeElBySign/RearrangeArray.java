import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0 ;i < nums.length ; i++){
            if (nums[i] > 0 ){
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }

        }

        for(int i = 0 ;i < pos.size() ; i++){
            ans.add(pos.get(i));
            ans.add(neg.get(i));
        }

    //    System.out.println(pos);
    //    System.out.println(neg);
    //    System.out.println(ans);

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] rearrangeArr(int[] nums) {
        int result[] = new int[nums.length];
        int p=0;
        int n=1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[p]=nums[i];
                p+=2;
            }
            else{
                result[n]=nums[i];
                n+=2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums ={3,1,-2,-5,2,-4};
        int[] result = rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
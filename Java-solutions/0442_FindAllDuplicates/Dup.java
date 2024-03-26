import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Dup
 */
public class Dup {

    static List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int num : nums){
            if(set.contains(num)){
                ans.add(num);
            }else{
                set.add(num); 
            }
        }
        return ans;
    }
}
import java.util.ArrayList;
import java.util.Collections;

/**
 * KFactor
 */
public class KFactor {

    public static void main(String[] args) {
        System.out.println(kthFactor(12, 3));
    }

    static int kthFactor(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
          for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    list.add(i);
                } else {
                    list.add(i);
                    list.add(n/i);
                }
            }
        }

        Collections.sort(list); // since size was small

         if (k > list.size()) {
            return -1;
        }
        System.out.println(list);

        return list.get(k-1);
    }
}
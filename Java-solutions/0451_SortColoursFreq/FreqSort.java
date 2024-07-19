import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FreqSort
 */
public class FreqSort {

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    static String frequencySort(String s) {
        Map<Character, Integer> frequency = new HashMap<>();

        for(char c : s.toCharArray()){
            if (frequency.containsKey(c)) {
                frequency.put(c, 1 + frequency.get(c));
            } else {
                frequency.put(c, 1);
            }
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(frequency.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());
        System.out.println(entryList);

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
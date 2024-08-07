
import java.util.Arrays;



/**
 * ReverseIII
 */
public class ReverseIII {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWord(s));
    }

    static String reverseWord(String s){
        String[] words = s.trim().split(" ");
        System.out.println(Arrays.toString(words));
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }

        return result.toString().trim();
      }
}
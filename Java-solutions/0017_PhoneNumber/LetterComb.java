
import java.util.ArrayList;
import java.util.List;

/**
 * LetterComb
 */
public class LetterComb {

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
              return new ArrayList<>();
          }
          return padRet("", digits);
      }
  
      static List<String> padRet(String p, String up) {
          if (up.isEmpty()) {
              ArrayList<String> list = new ArrayList<>();
              list.add(p);
              return list;
          }
  
          int digit = up.charAt(0) - '0'; 
  
          ArrayList<String> ans = new ArrayList<>();
          int start = (digit - 2) * 3;
          int end = start + 3;
        switch (digit) {
            case 7 -> end = start + 4;
            case 8 -> {
                start += 1;
                end = start + 3;
            }
            case 9 -> {
                start += 1;
                end = start + 4;
            }
            default -> {
            }
        }
  
          for (int i = start; i < end; i++) {
              char ch = (char) ('a' + i);
              ans.addAll(padRet(p + ch, up.substring(1)));
          }
  
          return ans;
      }
}
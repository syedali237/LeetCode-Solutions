import java.util.Arrays;

/**
 * ReverseWord
 */
public class ReverseWord {
    public static void main(String[] args) {
        // String s = "the sky is blue";
        // String s = "a good   example";
        String s = "  hello world  ";
        System.out.println(reverseWord(s));
    }

    static String reverseWord(String s){
      String[] str = s.trim().split(" ");
      System.out.println(Arrays.toString(str));

      //str = [a, good, , , example]

      StringBuilder reversed = new StringBuilder();
      for (int i = str.length - 1; i > 0; i--) {
        if (!str[i].isEmpty()) {
            reversed.append(str[i]).append(" ");  
        }
      }
      reversed.append(str[0]);

      return reversed.toString();
    }
}
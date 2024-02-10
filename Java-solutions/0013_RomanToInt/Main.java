import java.util.HashMap;
import java.util.Map;

public class Main {
    public int romanToInt(String s) {
        Map<Character, Integer> value = new HashMap<>();
        value.put('I', 1);
        value.put('V', 5);
        value.put('X', 10);
        value.put('L', 50);
        value.put('C', 100);
        value.put('D', 500);
        value.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentSymbol = value.get(s.charAt(i));
            int nextSymbol = (i < s.length() - 1) ? value.get(s.charAt(i + 1)) : 0;
            if (nextSymbol > currentSymbol) {
                result -= currentSymbol;
            } else {
                result += currentSymbol;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Main solution = new Main();
        String s = "III";
        System.out.println(solution.romanToInt(s));
    }
}
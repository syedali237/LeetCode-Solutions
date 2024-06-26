import java.util.HashMap;
import java.util.Map;

public class Roman {

    static int romanInt(String s){
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }


    static int romanToInt(String s) {
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
        String s = "III";
        System.out.println(romanToInt(s));
    }
}
/**
 * RemoveOuter
 */
public class RemoveOuter {

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(remove(s));
    }

    static String remove(String s){
        StringBuilder ans =  new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                count++;
                if (count > 1) {
                    ans.append(s.charAt(i));
                }
            } else {
                count--;
                if (count> 0) {
                    ans.append(s.charAt(i));
                }
            }
        }
        return ans.toString();
    }
}
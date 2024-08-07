public class StringHalf {
    boolean halvesAreAlike(String s) {
        int c1 = 0;
        int c2 = 0;

        // s = s.toLowerCase();

        for (int i = 0; i < s.length()/2 ; i++){
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                c1++;
            }
        }

        for (int i = s.length()/2; i < s.length() ; i++){
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                c2++;
            }
        }

        return c1 == c2;
    }
}
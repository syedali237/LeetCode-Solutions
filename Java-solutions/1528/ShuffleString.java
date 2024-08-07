/**
 * ShuffleString
 */
public class ShuffleString {

    public static void main(String[] args) {
        
    }

    static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++){
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }

    String restoreString2(String s, int[] indices) {
        char[] restored = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            restored[indices[i]] = s.charAt(i);
        }
        return new String(restored);
    }
}
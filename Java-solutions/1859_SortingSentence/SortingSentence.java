import java.util.Arrays;

/**
 * SortingSentence
 */
public class SortingSentence {

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        StringBuilder sb = new StringBuilder();

        for (String strElem : str){
            int i = (int)(strElem.charAt(strElem.length()-1) - '0');
            res[i - 1] = strElem.substring(0, strElem.length() - 1);
        }

        System.out.println(Arrays.toString(res));

        for (int j = 0; j < res.length - 1 ; j++){
            sb.append(res[j]).append(" ");
        }
        sb.append(res[res.length - 1]);
        System.out.println(sb);

        return sb.toString();
    }
}
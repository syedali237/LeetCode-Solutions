/**
 * ExcelCol
 */
public class ExcelCol {

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    static String convertToTitle(int colNum) {
        StringBuilder result = new StringBuilder();
        while(colNum > 0){
            colNum--;
            char c = (char)('A' + colNum % 26);
            result.insert(0 , c);
            colNum /= 26;
        }
        return result.toString();
    }
}
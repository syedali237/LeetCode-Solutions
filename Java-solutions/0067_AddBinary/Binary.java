/**
 * Binary
 */
public class Binary {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >=0 || j >= 0 || carry == 1){
            // Now, we subtract by '0' to convert the numbers 
            // from a char type into an int,
            //  so we can perform operations on the numbers
            if(i>=0) carry += a.charAt(i--) - '0';
            if(j>=0) carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();

    }
}
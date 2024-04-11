/**
 * One
 */
public class One {

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
            digits[i]++;
            return digits;
            }
            digits[i] = 0;
        }

     // if all number inside array are 9
    // i.e. [ 9,9,9,9 ] than according to above loop it will become [ 0,0,0,0 ]
    // but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ]


    // to make like above we need to make new array of length--> n+1
    // by default new array values are set to -->0 only
    // thus just changed first value of array to 1 and return the array
    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
    }
    
}
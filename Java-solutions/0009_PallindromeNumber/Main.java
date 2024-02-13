class Solution {
    public boolean isPalindrome(int x) {
        long rev = 0;
        long temp = x;

        while (temp > 0) {
            int rem = (int) (temp % 10);
            rev = rev * 10 + rem;
            temp /= 10;
        }

        return rev == x;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int number = 121;
        boolean result = solution.isPalindrome(number);
        System.out.println(result); // Output: true
    }
}
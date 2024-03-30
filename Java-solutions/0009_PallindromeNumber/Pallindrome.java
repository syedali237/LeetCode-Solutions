class Pallindrome {
    static boolean isPalindrome(int x) {
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
        int number = 121;
        boolean result = isPalindrome(number);
        System.out.println(result); // Output: true
    }
}
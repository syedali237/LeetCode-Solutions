public class FindNumbers {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for( int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        // int c = 0;
        // for negative numebrs
        if (num < 0) {
            num = num * -1;
        }
        // int n = num;
        // while(n > 0){
        //     c++;
        //     n = n/10;
        // }  
        // OR

        // short method to find number of digits
        int c = (int)(Math.log10(num) +1);

        return (c%2 == 0);
    }

    static int findNumbers2(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if ((int)((Math.log10(nums[i]))+1)%2==0)
            c++;
            }
        return c;
    }
}
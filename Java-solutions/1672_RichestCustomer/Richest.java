public class Richest {

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts){
        int maxValue = 0;
        for (int person = 0 ; person< accounts.length ; person++){
            int bankSum = 0 ;
            for (int bank = 0 ; bank < accounts[person].length ; bank++){
                bankSum += accounts[person][bank];
            }
            if(bankSum > maxValue){
                maxValue = bankSum;
            }
        }
        return maxValue;
    }
}
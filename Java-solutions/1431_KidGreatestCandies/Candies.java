import java.util.ArrayList;

public class Candies {

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        ArrayList<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }

    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> Answer = new ArrayList<>();
        int maxValue = 0 ;
        //finding max value in array
        for(int i =0 ; i< candies.length;i++){
            maxValue = Math.max(maxValue, candies[i]);
        }
        for(int i = 0 ; i<candies.length; i++){
            if (candies[i] + extraCandies >= maxValue) {
                 Answer.add(true);
            } else {
                Answer.add(false);
            }
        } 

        return Answer;
    }

}
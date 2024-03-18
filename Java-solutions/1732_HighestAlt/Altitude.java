/**
 * Altitude
 */
 //https://www.youtube.com/watch?v=3bl85V7GzLY
public class Altitude {
    public static void main(String[] args) {
        
    }

    static int largestAltitude(int[] gain) {
        int maxGain = 0;
        int currentAlt = 0;
        for(int g : gain){
            currentAlt += g;
            maxGain = Math.max(maxGain , currentAlt);
        }
        return maxGain;
    }
}
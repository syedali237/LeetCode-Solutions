
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Ransom
 */
public class Ransom {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    
    static boolean canConstruct(String ransomNote, String magazine) {
        // Create an array to count the occurrences of each letter in the magazine
        int[] letters = new int[26];
        System.out.println(Arrays.toString(letters));

        for (char c : magazine.toCharArray()) {
            // Increment the count for this character in the letters array
            letters[c - 'a']++;
        }
        System.out.println(Arrays.toString(letters));
        
        // Iterate through each character in the ransom note
        for (char c : ransomNote.toCharArray()) {
            // Decrement the count for this character in the letters array
            if (--letters[c - 'a'] < 0) {
                // If any character count goes below zero, return false
                // This means the ransom note requires more of this character
                // than what is available in the magazine
                return false;
            }
        }

        System.out.println(Arrays.toString(letters));
        return true;
    }

    boolean canConstruct2(String ransomNote, String magazine) {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!letterCount.containsKey(c) || letterCount.get(c) == 0) {
                return false;
            }
            letterCount.put(c, letterCount.get(c) - 1);
        }
        return true;
    }
}
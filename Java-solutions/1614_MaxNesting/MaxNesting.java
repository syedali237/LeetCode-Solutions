/**
 * MaxNesting
 */
public class MaxNesting {

    public static void main(String[] args) {
        
    }

    static int maxDepth(String s) {
        int count = 0;
        int brackets = 0;
        for(char ch : s.toCharArray()){
            if (ch == '(') {
                brackets++;
            } else if (ch == ')') {
                brackets--;
            }
            count = Math.max(count, brackets);
        }
        return count;
    }
} 

import java.util.Scanner;

public class LongestValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parentheses string (only '(' and ')'):");
        String s = sc.nextLine();

        System.out.println("Longest valid parentheses length: " + longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        int left = 0, right = 0, maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') left++;
            else right++;

            if (left == right) {
                maxLen = Math.max(maxLen, 2 * right);
            } else if (right > left) {
                left = right = 0; 
            }
        }

       
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') left++;
            else right++;

            if (left == right) {
                maxLen = Math.max(maxLen, 2 * left);
            } else if (left > right) {
                left = right = 0; 
            }
        }

        return maxLen;
    }
}

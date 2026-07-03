
import java.util.Stack;

public class Prob_20 {

    // Approach: 
    // 1. Use a stack to keep track of opening brackets.
    // 2. Iterate through each character in the string.
    // 3. If it's an opening bracket, push it onto the stack.
    // 4. If it's a closing bracket, check if the stack is not empty and the top of the stack is the corresponding opening bracket. If so, pop the stack; otherwise, return false.
    // 5. After processing all characters, if the stack is empty, return true; otherwise, return false.
    public boolean isValid(String s) {
        // Implementation for validating parentheses
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([)]";
        Prob_20 solution = new Prob_20();
        boolean result = solution.isValid(s);
        System.out.println(result); // Output: false 
        // // ours giving true still giving true look for the issue
    }
}


import java.util.ArrayList;
import java.util.List;

public class Prob_1291 {

    // Approach: Optimized approach to generate sequential digits within a given range
    // 1. Use a string "123456789" to generate sequential digits
    // 2. Iterate through possible lengths of sequential digits (from 2 to 9)
    // 3. For each length, generate all possible sequential digits by taking substrings of the "123456789" string
    // 4. Check if the generated number is within the given range [low, high]
    // 5. If it is, add it to the result list
    // 6. Return the result list containing all valid sequential digits.

    // Time Complexity: O(1) since the number of sequential digits is limited and does not depend on the input size
    // Space Complexity: O(1) for the result list, as the number of sequential digits is bounded and does not grow with the input size

    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";

        for (int length = 2; length <= 9; length++) {
            for (int start = 0; start <= 9 - length; start++) {
                String numStr = digits.substring(start, start + length);
                int num = Integer.parseInt(numStr);
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        List<Integer> result = sequentialDigits(low, high);
        System.out.println(result);
    }
}

public class RearrangeString {

    // Requirements:
    // 1. Given a string s and two characters x and y, rearrange the string such that:
    //   - All occurrences of character y should appear before all occurrences of character x in a new string t.
    //   - t is the permutation of s. (permutation means rearranging the characters of s to form t)
    //   - return any valid string t.


    // Approach:
    // 1. Count the occurrences of characters x and y in the input string s.
    // 2. Append all occurrences of character y to the result.
    // 3. Append all occurrences of character x to the result.
    // 4. Append any remaining characters (if any) to the result.

    // Time Complexity: O(n) where n is the length of the input string s, as we need to iterate through the string to count occurrences and build the result.
    // Space Complexity: O(n) for the result string, as we are creating a new string to store the rearranged characters.

    public static String rearrangeString(String s, char x, char y){
        StringBuilder result = new StringBuilder();
        int countX = 0;
        int countY = 0;

        // Count occurrences of x and y
        for (char c : s.toCharArray()) {
            if (c == x) countX++;
            else if (c == y) countY++;
        }

        // Append all occurrences of y
        for (int i = 0; i < countY; i++) {
            result.append(y);
        }

        // Append all occurrences of x
        for (int i = 0; i < countX; i++) {
            result.append(x);
        }

        // Append any remaining characters
        for (char c : s.toCharArray()) {
            if (c != x && c != y) {
                result.append(c);
            }
        }

        return result.toString();
    }




    public static void main(String[] args) {
        String input = "aabc";
        char x = 'a';
        char y = 'c';
        String rearranged = rearrangeString(input, x, y);
        System.out.println(rearranged);
    }
}

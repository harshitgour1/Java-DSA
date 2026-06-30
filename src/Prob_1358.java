public class Prob_1358 {
    // Problem: Given a string s, return the number of substrings that contain all three characters 'a', 'b', and 'c'.
    // example: Input: s = "abcabc" Output: 10 (substrings: "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc", "abc")

    // Approach: Brute Force
    // 1. Initialize a count variable to keep track of the number of valid substrings.
    // 2. Use two nested loops to generate all possible substrings of the input string
    // 3. For each substring, check if it contains all three characters 'a', 'b', and 'c'.
    // 4. If it does, increment the count variable.


    // Time Complexity: O(n^2), where n is the length of the input string
    // Space Complexity: O(1), as we are using a constant amount of space for the count variable and boolean flags.

    // Optimization: We can optimize the solution to O(n) time complexity using a sliding window approach. We can maintain a count of the characters 'a', 'b', and 'c' in the current window and expand or shrink the window as needed to ensure that all three characters are present.
    // Approach: Sliding Window
    // 1. Initialize a count variable to keep track of the number of valid substrings
    // 2. Use two pointers, left and right, to represent the current window of characters in the string
    // 3. Expand the right pointer to include new characters in the window and update the count of 'a', 'b', and 'c' in the window
    // 4. Once all three characters are present in the window, increment the count variable by the number of valid substrings that can be formed with the current window
    // 5. Shrink the window from the left by moving the left pointer to the right and updating the count of 'a', 'b', and 'c' in the window
    // 6. Repeat steps 3-5 until the right pointer reaches the end of the string

    public static int numberOfSubstrings(String s){
        // int count = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     boolean hasA = false, hasB = false, hasC = false;
        //     for (int j = i; j < s.length(); j++) {
        //         if (s.charAt(j) == 'a') hasA = true;
        //         if (s.charAt(j) == 'b') hasB = true;
        //         if (s.charAt(j) == 'c') hasC = true;
        //         if (hasA && hasB && hasC) {
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int count = 0;
        int left = 0;
        int[] charCount = new int[3]; // To count occurrences of 'a', 'b', and 'c'

        for (int right = 0; right < s.length(); right++) {
            charCount[s.charAt(right) - 'a']++; // Increment the count for the current character

            // Check if we have at least one of each character
            while (charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0) {
                count += s.length() - right; // All substrings starting from left to right are valid
                charCount[s.charAt(left) - 'a']--; // Decrement the count for the left character
                left++; // Move the left pointer to the right
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aaaaabc";
        System.out.println(numberOfSubstrings(s));
    }
}

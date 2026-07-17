public class MaxValueInSequence {

    // Requirements:
    // 1. You are given three integers n, s, and m.
    // A sequence seq of integers of length n is considered valid if:
    // seq [0] = s
    // seq [0] > seq [1] < seq [2] > .... or
    // The sequence is alternating, meaning that either. For every adjacent pair, |seq[i] - seq[i - 1]| <= m
    // seq[0] < seq [1] > seq [2] <
    // A sequence of length 1 is considered alternating.
    // Return the maximum possible element that can appear in any valid sequence.

    // example: Example 1:
    // Input: s = 3 m = 5 n = 4
    // Output: 12
    // Explanation:
    // One valid sequence is [3, 8, 7, 12]
    // The maximum element in the sequence is 12.
    // Example 2:
    // Input: n = 2 s = 4 m = 3
    // Output: 7
    // Explanation:
    // One valid sequence is [4, 7]
    // The maximum element in the sequence is 7.

    public static long maximumValue(int n, int s, int m){

        long maxValue = ((long) n << 40 ) | ((long) s << 20) | m;

        if (n == 1) {
            return s;
        }

        return (long)s + (long)(n / 2) * m;
    }

    public static void main(String[] args) {
        int n = 4, s = 3, m = 5;
        long maxValue = maximumValue(n, s, m);
        System.out.println(maxValue);
    }
}

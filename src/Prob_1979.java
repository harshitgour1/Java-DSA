

public class Prob_1979 {

    // Approach: Find the GCD of the minimum and maximum elements in the array
    // 1. Initialize min and max variables to track the minimum and maximum values in the array.
    // 2. Iterate through the array to find the minimum and maximum values.
    // 3. Use the Euclidean algorithm to find the GCD of the minimum and maximum values.

    // Time Complexity: O(n) for finding min and max, O(log(min, max)) for GCD calculation
    // Space Complexity: O(1) as we are using a constant amount of space

    // explaination of the approach to find GCD:
    // The GCD (Greatest Common Divisor) of two numbers is the largest positive integer that divides both numbers without leaving a remainder.
    // The Euclidean algorithm is an efficient method for computing the GCD of two numbers.
    // The algorithm is based on the principle that the GCD of two numbers also divides their difference.
    // The steps of the Euclidean algorithm are as follows:
    // 1. Given two numbers a and b, where a >= b, we can express a as:
    //    a = b * q + r, where q is the quotient and r is the remainder when a is divided by b.
    // 2. The GCD of a and b is the same as the GCD of b and r (the remainder).
    // 3. We repeat this process, replacing a with b and b with r,

    public static int findGCD(int[] nums){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            if(num < min) min = num;
            if(num > max) max = num;
        }

        return gcd(min, max);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        System.out.println(findGCD(nums));
    }
}

public class MaxDigitRange {

    // Requirement: Given an array of integers, find the maximum digit range (the difference between the largest and smallest digits) among all the integers in the array.
        // the digit range of a number is defined as the difference between its largest and smallest digits. For example, the digit range of 5724 is 7 - 2 = 5, and the digit range of 111 is 1 - 1 = 0.
        // return the sum of integers in the array that have the maximum digit range. (5274 + 350 = 6074)

    public static int maxDigitRange(int[] nums) {
        int digitRange = 0;
        int digitLargest = Integer.MIN_VALUE;
        int digitSmallest = Integer.MAX_VALUE;
        int maxRange = Integer.MIN_VALUE;
        int sum = 0;    

        for (int num : nums) {
            int currentNum = num;
            digitLargest = Integer.MIN_VALUE;
            digitSmallest = Integer.MAX_VALUE;

            // Find the largest and smallest digits in the current number
            while (currentNum > 0) {
                int digit = currentNum % 10;
                digitLargest = Math.max(digitLargest, digit);
                digitSmallest = Math.min(digitSmallest, digit);
                currentNum /= 10;
            }

            // Calculate the digit range for the current number
            digitRange = digitLargest - digitSmallest;

            // Update maxRange and sum if necessary
            if (digitRange > maxRange) {
                maxRange = digitRange;
                sum = num; // Reset sum to the current number
            } else if (digitRange == maxRange) {
                sum += num; // Add to sum if the range is equal to maxRange
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {5724, 111, 350};
        System.out.println(maxDigitRange(nums));
    }
}

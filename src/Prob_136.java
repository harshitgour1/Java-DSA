public class Prob_136 {

    // Approach:
    // 1. Use XOR operation to find the single number in the array.
    // 2. Initialize a variable 'count' to 0.
    // 3. Iterate through each number in the array and perform XOR with 'count'.
    // Working of XOR:
    // - XOR of a number with itself is 0 (a ^ a = 0
    // 4. The result will be the single number that appears only once in the array


    public int singleNumber(int[] nums){
        int count = 0;
        for(int num : nums){
            count ^= num; // Using XOR to find the single number
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        Prob_136 solution = new Prob_136();
        int result = solution.singleNumber(nums);
        System.out.println(result); // Output: 4
    }
}

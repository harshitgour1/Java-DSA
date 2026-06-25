public class Prob_3737 {

    public static int countMajoritySubarrays(int [] nums, int target){

        // Count the number of subarrays where the majority element is equal to the target value.

        // approach:
        // 1. Iterate through all possible subarrays of the given array.
        // 2. For each subarray, count the occurrences of the target value.
        // 3. If the count of the target value is greater than half the length of the subarray, increment the count of majority subarrays.
        // 4. Return the final count of majority subarrays.

        // explaining the code:
        // The outer loop iterates through all possible starting indices of subarrays.
        // The inner loop iterates through all possible ending indices of subarrays starting from the current starting index.
        // For each subarray, we count the occurrences of the target value and check if it is greater than half the length of the subarray. 
        // If it is, we increment the count of majority subarrays.
        // Finally, we return the count of majority subarrays.


        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int mjCount = 0;
            for(int j = i; j < n; j++){
                if(nums[j] == target){
                    mjCount++;
                }
                if(mjCount > (j - i + 1) / 2){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        int target = 2;
        int result = countMajoritySubarrays(nums, target);
        System.out.println(result);
    }
}

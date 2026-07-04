public class Prob_3978 {

    // Approach:
    // 1. Use two pointers to check the uniqueness of the middle element in the array.
    // 2. Initialize two pointers, 'low' at the start and 'high' at the end of the array.
    // 3. Initialize a variable 'count' to 1 (to count the middle element).
    // 4. Iterate while 'low' is less than 'high':
    // - If the elements at 'low' and 'high' are equal, increment 'count'.
    // - Move 'low' pointer forward and 'high' pointer backward.


    public static boolean isMiddleElementUnique(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        int count = 1; // Count the middle element

        
        // for example, if the array is sorted, you can check if the middle element is equal to its neighbors. If it is equal to either neighbor, it is not unique. If it is not equal to either neighbor, it is unique.

        for(int i = 0; i < nums.length; i++){
            if(i == nums.length / 2){ // Check the middle element
                if((i > 0 && nums[i] == nums[i - 1]) || (i < nums.length - 1 && nums[i] == nums[i + 1])){
                    return false; // Middle element is not unique
                }
            }
        }
        return true; // Middle element is unique
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2}; // output: true want false (because middle element is 2 and it is non-unique)
        boolean result = isMiddleElementUnique(nums);
        System.out.println(result); // Output: true or false based on the uniqueness of the middle
    }
}

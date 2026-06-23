
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_from_Sorted_Array {

    public static int removeDuplicates(int[] nums){

        // if (nums.length == 0) {
        //     return 0;
        // }
        // int uniqueCount = 1; // Start with 1 since the first element is always unique
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] != nums[i - 1]) { // indexoutofbound exception if we start with i = 0 because we are comparing with the previous element
        //         nums[uniqueCount] = nums[i]; // Move the unique element to the correct position
        //         uniqueCount++;
        //     }
        // }
        // return uniqueCount;

        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> uniqueElements = new HashSet<>();
        int uniqueCount = 0;
        for (int num : nums) {
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);
                nums[uniqueCount] = num; // Move the unique element to the correct position
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
    }
}

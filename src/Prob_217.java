import java.util.HashSet;
import java.util.Set;

public class Prob_217 {

    public static boolean containsDuplicate(int[] nums){
        
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }

        Set<Integer> set = new HashSet<>();
        
        // Time Complexity: O(n) - We traverse the array once, and each insertion/check in the HashSet is O(1) on average.
        // Space Complexity: O(n) - In the worst case, if all elements are unique, we will store all n elements in the HashSet.

        // for(int num : nums){
        //     if(set.contains(num)){
        //         return true;
        //     }
        //     set.add(num);
        // }

        // More optimized version using add method which returns false if the element already exists in the set
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums));
    }
}

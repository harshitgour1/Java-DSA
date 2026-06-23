public class Prob_3689 {

    public long maxTotalValue(int[] nums, int k) {
        // You need to choose exactly k non-empty subarrays nums[l..r] of nums. Subarrays may overlap, and 
        // the exact same subarray (same l and r) can be chosen more than once.
        // The value of a subarray nums[l..r] is defined as: max(nums[l..r]) - min(nums[l..r]).
        // The total value is the sum of the values of all chosen subarrays.
        // Return the maximum possible total value you can achieve.

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int x: nums){
            max = Math.max(max, x);
            min = Math.min(min, x);
        }


        return 1L * (max - min) * k;
    }

    public static void main(String[] args) {
        Prob_3689 obj = new Prob_3689();
        int[] nums = {1,3,2};
        int k = 2;
        
        System.out.println(obj.maxTotalValue(nums, k));

    }
}

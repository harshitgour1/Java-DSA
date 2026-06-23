public class Missing_Number {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = 0;
        // System.out.println(n + " " + (n-1));
        for(int i = 0; i < n; i++){
            actualSum += nums[i];
        }

        int expectedSum = (n * (n+1)) / 2;

        int missing = expectedSum - actualSum;

        return missing;
    }

    public static void main(String[] args) {
        Missing_Number mn = new Missing_Number();
        int[] nums = {3, 0, 1};
        System.out.println(mn.missingNumber(nums));
    }
}

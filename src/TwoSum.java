public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j > i; j--){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSum(nums, target);
        System.out.println("Indices: " + indices[0] + ", " + indices[1]);
    }
}

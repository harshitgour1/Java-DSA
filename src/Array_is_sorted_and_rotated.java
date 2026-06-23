public class Array_is_sorted_and_rotated {

    public static boolean check(int[] nums){
        boolean result = false;
        int n = nums.length;


        // explain it: 
        // we are counting the number of times the current element is greater than the next element in the array.

        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[(i + 1) % n]){
                count++;
            }
        }

        return count <= 1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        boolean result = check(nums);
        System.out.println("Is the array sorted and rotated? " + result);
    }
}

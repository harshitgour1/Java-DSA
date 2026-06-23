public class Rotate_Array {
    public static void rotate(int[] nums, int k){
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than n
        reverse(nums, 0, n - 1); // Reverse the entire array
        System.out.println("After reversing the entire array: "+ java.util.Arrays.toString(nums));
        reverse(nums, 0, k - 1); // Reverse the first k elements
        System.out.println("After reversing the first " + k + " elements: "+ java.util.Arrays.toString(nums));  
        reverse(nums, k, n - 1); // Reverse the remaining elements
        System.out.println("After rotating the array: "+ java.util.Arrays.toString(nums));
    }
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums, k);
        System.out.println("Rotated array: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}

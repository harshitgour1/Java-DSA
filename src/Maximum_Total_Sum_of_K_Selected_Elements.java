
import java.util.Arrays;

public class Maximum_Total_Sum_of_K_Selected_Elements {

    // select k values(top max values) from the array and multiply them with mul and return the total sum of the selected values
    // untill the mul becomes 0, we have to switch and start adding the values to the total sum
    // decrease the mul by 1 after each processing of k values
    // eg. selection 9,6,2 process 9 -> 9*2 = 18, mul = 1, process 6 -> 6*1 = 6, mul = 0, process 2 (addition), total sum = 18 + 6 + 2 = 26
    
    // Approach:
    // 1. Sort the array in descending order
    // 2. Select the top k values from the sorted array
    // 3. Multiply the selected values with mul and add them to the total sum
    // 4. Decrease the mul by 1 after each processing of k values
    // 5. If mul becomes 0, start adding the remaining values to the total sum
    
    public long maxSum(int[] nums, int k, int mul){
        long totalSum = 0;
        Arrays.sort(nums);

        int n = nums.length;

        int p = Math.min(k, Math.max(0, mul - 1));

        int idx = n - 1;

        for(int m = mul; m >= mul - p + 1; m--){
            totalSum += 1L * nums[idx--] * m;
        }

        for(int i = p; i < k; i++){
            totalSum += nums[idx--];
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[] nums = {6,1,2,9};
        int k = 3;
        int mul = 2;
        Maximum_Total_Sum_of_K_Selected_Elements solution = new Maximum_Total_Sum_of_K_Selected_Elements();
        System.out.println(solution.maxSum(nums, k, mul));
    }
}

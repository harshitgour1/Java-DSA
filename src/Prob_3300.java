
/* 
You are given an integer array nums
You replace each element in nums with the sum of its digits.
Return the minimum element in nums after all replacements.
Example 1:
Input: nums [10,12,13,14]
Output: 1
Explanation:
nums becomes [1, 3, 4, 5] after all replacements, with minimum element 1.
Example 2:
Input: nums = [1,2,3,4]
Output: 1 
Explanation:
nums becomes [1, 2, 3, 4] after all replacements, with minimum element 1.
Example 3:
Input: nums = [999,19,199]
Output: 10
Explanation:
nums becomes [27, 10, 19] after all replacements, with minimum element 10.
*/

public class Prob_3300 {

    public static int minElement(int[] nums){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            int sumOfDigits = 0;
            int num = nums[i];
            while(num > 0){
                sumOfDigits += num % 10;
                num /= 10;
            }
            if(sumOfDigits < min){
                min = sumOfDigits;
            }
        }

        return min;

    }

    public static void main(String[] args) {
        int[] nums = {10,12,13,14};
        System.out.println(minElement(nums));
    }
}


import java.util.HashMap;
import java.util.Map;

public class Freq_Balanced_SubArray {

    public static int countFreqBalancedSubarrays(int[] nums) {

        // freq balanced subarray is:
        // if subarray only has one element then it is freq balanced subarray
        // if subarray contains atleast two elements then every element with max freq should appear exactly twice as many times as every other distinct value in the subarray.
        // return the number  denothing the length of the longest freq balanced subarray
        // the freq of a element is the number of times it appears in the array.


        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[1001]; // Assuming the range of numbers is 1 to 1000
            int maxFreq = 0;
            int distinctCount = 0;

            for (int j = i; j < n; j++) {
                freq[nums[j]]++;
                if (freq[nums[j]] == 1) {
                    distinctCount++;
                }
                maxFreq = Math.max(maxFreq, freq[nums[j]]);

                // Check if the current subarray is freq balanced
                boolean isBalanced = true;
                for (int k = 1; k <= 1000; k++) {
                    if (freq[k] > 0 && freq[k] != maxFreq && freq[k] != maxFreq / 2) {
                        isBalanced = false;
                        break;
                    }
                }

                if (isBalanced) {
                    count++;
                }
            }
        }

        // optimal approach is to use a hashmap to store the frequency of each element in the subarray and then check if the subarray is freq balanced or not.

        Map<Integer, Integer> freqMap = new HashMap<>();




      

        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 2, 3, 3, 3};
        System.out.println(countFreqBalancedSubarrays(nums));
    }

    
        // private static boolean isFreqBalanced(Map<Integer, Integer> freqMap) {

        //     if (freqMap.size() == 1) {
        //         return true; // Single element is always freq balanced
        //     }

        //     int maxFreq = 0;
        //     int minFreq = Integer.MAX_VALUE;

        //     for (int freq : freqMap.values()) {
        //         maxFreq = Math.max(maxFreq, freq);
        //         minFreq = Math.min(minFreq, freq);
        //     }

        //     // Check if the max frequency is exactly twice the min frequency
        //     return maxFreq == 2 * minFreq;
        // }


        // Map<Integer, Integer> freqMap = new HashMap<>();

        // int left = 0;
        // int maxLength = 0;

        // for (int right = 0; right < nums.length; right++) {
        //     freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);

        //     while (!isFreqBalanced(freqMap)) {
        //         freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
        //         if (freqMap.get(nums[left]) == 0) {
        //             freqMap.remove(nums[left]);
        //         }
        //         left++;
        //     }

        //     maxLength = Math.max(maxLength, right - left + 1);
        // }



}

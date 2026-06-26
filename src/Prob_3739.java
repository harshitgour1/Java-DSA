// Hard Category Problem
// O(n log n) solution using Fenwick Tree (Binary Indexed Tree) to count the number of subarrays with a given target value.
// solution explained in detail in the comments below.

// Approach:
// 1. We will use a Fenwick Tree (Binary Indexed Tree) to efficiently count the number of prefix sums that are less than the current prefix sum.
// 2. We will maintain a prefix sum array where each element represents the difference between the count of the target value and the count of other values in the subarray.
// 3. We will use a HashMap to rank the prefix sums and map them to indices in the Fenwick Tree.
// 4. For each prefix sum, we will query the Fenwick Tree to count the number of previous prefix sums that are strictly smaller than the current prefix sum, and update the Fenwick Tree with the current prefix sum.  
// 5. Finally, we will return the total count of subarrays that have the target value as the majority element.


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Prob_3739 {
    class Fenwick {
        int[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        void update(int idx, int delta) {
            while (idx <= n) {
                bit[idx] += delta;
                idx += idx & -idx;
            }
        }

        long query(int idx) {
            long sum = 0;
            while (idx > 0) {
                sum += bit[idx];
                idx -= idx & -idx;
            }
            return sum;
        }
    }

    public long countSubarrays(int[] nums, int target) {
        int n = nums.length;

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (nums[i] == target ? 1 : -1);
        }

        long[] vals = prefix.clone();
        Arrays.sort(vals);

        Map<Long, Integer> rank = new HashMap<>();
        int idx = 1;

        for (long v : vals) {
            if (!rank.containsKey(v)) {
                rank.put(v, idx++);
            }
        }

        Fenwick bit = new Fenwick(idx);

        long ans = 0;

        for (long cur : prefix) {
            int r = rank.get(cur);

            // count previous prefix sums strictly smaller
            ans += bit.query(r - 1);

            bit.update(r, 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 999999999, 888888888, 656569542};
        int target = 1000000000;
        Prob_3739 obj = new Prob_3739();
        long result = obj.countSubarrays(nums, target);
        System.out.println(result);
    }
}

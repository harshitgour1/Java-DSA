import java.util.HashMap;
import java.util.Map;

public class Prob_3020 {

    public int maximumLength(int[] nums) {
        Map<Long, Integer> freq = new HashMap<>();

        for(int num: nums){
            freq.put((long) num, freq.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;


        if(freq.containsKey(1L)){
            int cnt = freq.get(1L);
            ans = Math.max(ans, (cnt % 2 == 1) ? cnt : cnt - 1);
        }

        for(long start : freq.keySet()){
            if(start == 1L) continue;

            long cur = start;
            int len = 0;

            while(freq.getOrDefault(cur, 0) >= 2){
                len += 2;

                if(cur > 1_000_000_000L){
                    cur = Long.MAX_VALUE;
                    break;
                }

                cur *= cur;
            }

            if(freq.getOrDefault(cur, 0) >= 1){
                ans = Math.max(ans, len + 1);
            }
            else{
                ans = Math.max(ans, Math.max(1, len - 1));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Prob_3020 solution = new Prob_3020();
        int[] nums = {1, 1, 1, 1};
        System.out.println(solution.maximumLength(nums));
    }
}

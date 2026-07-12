
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Prob_1331 {

    // Approach:
    // 1. Create a copy of the input array and sort it to determine the ranks
    // 2. Use a HashMap to store the rank of each unique number in the sorted array
    // 3. Iterate through the original array and replace each number with its corresponding rank from the HashMap
    // 4. Return the transformed array with ranks.

    // Time Complexity: O(n log n) due to sorting the array
    // Space Complexity: O(n) for the HashMap and the result array

    public static int[] arrayRankTransform(int[] arr){
        
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};

        int[] rankedArr = arrayRankTransform(arr);
        System.out.println(Arrays.toString(rankedArr));
    }
}

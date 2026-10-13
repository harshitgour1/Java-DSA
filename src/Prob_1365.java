import java.util.*;

public class Prob_1365 {

// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.

    // Brute Force Approach -- TC: O(n^2) SC: O(n)
    // public static int[] smallerNumbersThanCurrent(int[] nums){
    //     int[] result = new int[nums.length];

    //      for(int i = 0; i < nums.length; i++){
    //         int j;
    //         int count = 0;

    //         if(i == 0){
    //             j = 1;
    //         }else{
    //             j = 0;
    //         }

    //         while(j < nums.length){
    //             if(nums[j] != nums[i] && nums[j] < nums[i]){
    //                 count++;
    //             }
    //             j++;
    //         }
    //         result[i] = count;
    //      }

    //      return result;
    // }

    // Optimized Approach -- TC: O(nlogn) SC: O(n) why hashmap is used? because we need to store the index of the sorted array in the hashmap and then we can get the index of the original array from the hashmap.
    public static int[] smallerNumbersThanCurrent(int[] nums){

        // Approach:
        // - Create a copy of the input array and sort it.
        // - For each element in the sorted array, store its index in a HashMap.
        // - For each element in the original array, look up its index in the HashMap.

        HashMap<Integer, Integer> map = new HashMap<>(); 

        int arr[] = Arrays.copyOf(nums, nums.length);

        Arrays.sort(arr);

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
            }
        }

        int res[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            res[i] = map.get(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {8,1,2,2,3};

        int[] arr2 = smallerNumbersThanCurrent(arr1);

        for(int i : arr2){
            System.out.print(i + " ");
        }
        
    }
}

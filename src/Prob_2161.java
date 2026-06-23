public class Prob_2161 {
    
    public static int[] pivotArray(int[] nums, int pivot){
        
        // Maintain the relative order of the elements less than pivot and greater than pivot
        // for -> {9, 12, 5, 10, 14, 3, 10} pivot -> 10, output -> {9, 5, 3, 10, 10, 12, 14}


            int[] result = new int[nums.length];
            int i = 0;
            for(int num : nums){
                if(num < pivot){
                    result[i++] = num;
                }
            }
            for(int num : nums){
                if(num == pivot){
                    result[i++] = num;
                }
            }
            for(int num : nums){
                if(num > pivot){
                    result[i++] = num;
                }
            }
            
        return result;
    }
    
    public static void main(String[] args) {
        // int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int[] nums = {-3, 4, 3, 2};
        int pivot = 2;
        int[] result = pivotArray(nums, pivot);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}

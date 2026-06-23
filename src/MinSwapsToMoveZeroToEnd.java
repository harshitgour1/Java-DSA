public class MinSwapsToMoveZeroToEnd {

    public static int minSwaps(int[] nums){
        int count = 0;
        int n = nums.length; 
        // System.out.println("n: " + n);
        for (int i = 0; i < n; i++) {

            System.out.println("nums[i] " + nums[i] + " index: " + i);
            // Write correct logic here to swap the elements and count the number of swaps,  Minimum number of swaps required to move all the zeros to the end of the array.
            

            if(nums[i] == 0 && i < n - count){
                
                int temp = nums[i];
                nums[i] = nums[n - 1];
                nums[n -1] = temp;
                count++;

                System.out.println("i: " + nums[i] + ", count: " + count);
               
            } 
        }        
        return count;
    }
    public static void main(String[] args) {
        int [] nums = {0, 1, 0, 2};
        System.out.println(minSwaps(nums));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

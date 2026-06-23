public class Prob_169 {

    public static int majorityElement(int[] nums){
        int n = nums.length;
        int mj = 0;
        int i = 0;
        int count = 0;
        
        for(int num : nums){
            
            if(count == 0){
                mj = num;
            }
            if(num == mj){
                count++;
            } else {
                count--;
            }
        }
        return mj;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }
}

public class bitonic {

    public static int bitoArr(int []nums){
        int largest = Integer.MIN_VALUE;
        int largestIndex = 0;
        long ascendSum = 0;
        long descendSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
                largestIndex = i;
            }
        }
        
        for(int j = 0; j <= largestIndex; j++){
            ascendSum += nums[j];
        }
        for(int k = largestIndex; k < nums.length; k++){
            descendSum += nums[k];
        }

        if(ascendSum > descendSum){
            return 0;
        }
        else if(descendSum > ascendSum){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int []nums = {30494606,875031872,850559628,844602130};
        System.out.println(bitoArr(nums));

    }
}

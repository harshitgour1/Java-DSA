public class Prob_1732 {

    public static int largestAltitude(int[] gain){
        int prev;
        int curr = 0;
        int[] altitude = new int[gain.length];
        
        int n = gain.length;

        for(int i = 0; i < n; i++){
            if(i == 0){
                curr = gain[i];
            }

            if(i > 0 && i < n){
                prev = curr;
                curr = gain[i];

                curr = prev + curr;
            }
            altitude[i] = curr;
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(altitude[i] > max){
                max = altitude[i];
            }
        }
        return max > 0 ? max : 0;
    }


    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};

        System.out.println(largestAltitude(gain));
    }
}

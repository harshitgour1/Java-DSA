public class Prob_69 {
    
    // Ways to find the square root of a number
        // 1. Using binary search
        
        // 2. Using Newton's method
        // double guess = x / 2.0;
        // while(Math.abs(guess * guess - x) > 1e-6){
        //     guess = (guess + x / guess) / 2.0;
        // }
        // return (int)guess;

        // 3. Using built-in function
        // return (int)Math.sqrt(x);

        // 4. Using bit manipulation
        // int result = 0;
        // for(int i = 15; i >= 0; i--){
        //     result |= (1 << i);
        //     if(result * result > x) result ^= (1 << i);
        // }

    public static int mySqrt(int x){
        if(x < 2) return x;
        
        long left = 0;
        long right = x;

        while(left <= right) {
            long mid = (left + right) / 2;

            if(mid * mid == x)
                return (int)mid;

            if(mid * mid < x)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return (int)right;

        
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }
}

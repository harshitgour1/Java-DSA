public class Check_good_Integer {

    public static boolean checkGoodInt(int n){
        long digitSum = 0;
        long squareSum = 0;

        // Approach:
        // Traverse the n

        // Get the last digit of n and add it to digitSum and add its square to squareSum
        // Remove the last digit from n by dividing it by 10
        // for 19 gives false but for 99 gives true
        // 
        
        while(n > 0){
            int digit = n % 10;
            digitSum += digit;
            squareSum += (long) (digit * digit);
            n /= 10;
        }

        return squareSum - digitSum >= 50;

    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(checkGoodInt(n));
    }
}

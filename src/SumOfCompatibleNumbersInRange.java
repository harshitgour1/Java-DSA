public class SumOfCompatibleNumbersInRange {

    //1. The Search Window (abs(n - x) <= k)
    // This rule sets a strict boundary around n. It means your candidate number x cannot be further away from n than the
    //  value of k.Formula: x must fall between (n - k) and (n + k).Example (n=2, k=3): The range is 2 - 3 to 2 + 3 
    // (which translates to -1 to 5). Since numbers must be positive, 
    // our only options to test are 1, 2, 3, 4, 5.2. The Bitwise Check ((n & x) == 0)This rule requires that
    //  n and x do not share any binary 1 bits in the exact same column.Let's test
    //  our options against n = 2 (Binary 0010):x = 1 (0001): No overlapping 1s \(\rightarrow \) 
    // Valid (Add 1)x = 2 (0010): Overlaps at the second bit \(\rightarrow \) Invalidx = 3 (0011): Overlaps
    //  at the second bit \(\rightarrow \) Invalidx = 4 (0100): No overlapping 1s \(\rightarrow \) Valid (Add 4)x = 5 (0101):
    //  No overlapping 1s \(\rightarrow \) Valid (Add 5)Final ResultThe program finds the valid matches (1, 4, 5) and adds 
    // them together:\(1+4+5=10\)



    public static int sumOfGoodIntegers(int n, int k){
        int sum = 0;
        int start = Math.max(1, n-k);
        int end = n+k;
        for(int i = start; i <= end; i++){
            if(Math.abs(n-i) <= k && (n & i) == 0){
                sum += i;
            }
        }


        return sum;
    }
    public static void main(String[] args) {
        int n = 2, k = 3;
        System.out.println(sumOfGoodIntegers(n, k));
    }
}

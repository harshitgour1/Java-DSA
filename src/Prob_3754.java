public class Prob_3754 {

    // Requirement:
    // Given an Int n, form a new int x by concatenating all the non-zero digits of n in the same order as they appear in n. 
    // Return the product of x and the sum of the digits of x.
    // sum = sum of digits of x
    // return sum * x


    // Approach:
    // 1. Convert the integer n to a string to easily access each digit.
    // 2. Initialize two variables, sum and x, to 0. sum will hold the sum of the digits of x, and x will hold the concatenated non-zero digits.
    // 3. Iterate through each character in the string representation of n.
    // 4. For each character, check if it is not '0'. If it is not '0', convert it to an integer and add it to sum. Also, update x by multiplying the current value of x by 10 and adding the integer value of the character.
    // 5. After processing all characters, return the product of sum and x.

    public static long sumAndMultiply(int n){

        long sum = 0;
        long x = 0;

        String str = String.valueOf(n);


        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c != '0'){
                x = x * 10 + (c - '0'); // Forming x by concatenating non-zero digits
                sum += (c - '0');
            }
        }

        return sum * x;
    }

    public static void main(String[] args) {
        int n = 10203004;
        System.out.println(sumAndMultiply(n)); // output = 12340 (expected)
    }
}

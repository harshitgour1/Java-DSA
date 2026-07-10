public class Prob_415 {

    // Approach:
    // 1. Initialize a StringBuilder to build the result string.
    // 2. Use two pointers, i and j, to traverse the input strings num1 and num2 from the end to the beginning.
    // 3. Initialize a variable carry to keep track of the carry from the addition of two digits.
    // 4. Loop until both pointers are out of bounds and there is no carry left 
    // 5. Inside the loop, get the current digits from num1 and num2 using the pointers i and j. If a pointer is out of bounds, use 0 as the digit.
    // 6. Calculate the sum of the two digits and the carry. Append the last digit of the sum to the result StringBuilder and update the carry.
    // 7. After the loop, reverse the result StringBuilder and convert it to a string to get the final result.

    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;

        while(i >= 0 || j >= 0 || carry != 0){
            int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int digit2 = j >=0 ? num2.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum/10; 
        }

        return result.reverse().toString();
    }


    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";

        Prob_415 obj = new Prob_415();
        String result = obj.addStrings(num1, num2);
        System.out.println(result);
    }
}

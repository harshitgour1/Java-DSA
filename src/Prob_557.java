public class Prob_557 {

    // Approach:
    // 1. Convert the input string to a character array
    // 2. Iterate through the character array and find the start and end indices of each word
    // 3. Reverse the characters of each word in place using two pointers.
    // 4. Return the modified character array as a new string

    // Time Complexity: O(n), where n is the length of the input string
    // Space Complexity: O(n), for the character array

    public static String reverseWords(String s){

         char[] arr = s.toCharArray();

        int start = 0;
        for(int i = start; i <= arr.length; i++){

            if(i == arr.length || arr[i] == ' '){
                int left = start;
                int right = i - 1;
            

            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            start = i + 1;
            }
        }

        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}

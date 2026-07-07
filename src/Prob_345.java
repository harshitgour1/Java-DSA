public class Prob_345 {

    // Approach: Two pointers
    // 1. Initialize two pointers, left and right, at the beginning and end of the string respectively.
    // 2. Move the left pointer to the right until it points to a vowel.
    // 3. Move the right pointer to the left until it points to a vowel.
    // 4. If both pointers point to vowels, swap the characters at the left and right pointers.
    // 5. Move both pointers towards the center and repeat steps 2-4 until the pointers meet or cross each other.

    // Time Complexity: O(n), where n is the length of the string. We traverse the string once with two pointers.
    // Space Complexity: O(n), where n is the length of the string. We use a character array to store the modified string.


    public static String reverseVowels(String s){
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}

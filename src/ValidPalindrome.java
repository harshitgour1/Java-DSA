public class ValidPalindrome {

    public static boolean isPalindrome(String s){
        int n = s.length();

        if (s.isEmpty()) {
            System.out.println("It is a Palindrome");
            return true; // An empty string is considered a palindrome
        }
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // Remove non-alphanumeric characters and convert to lowercase
        n = s.length(); // Update the length after modification
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n-1-i)){ // indexoutofbound exception because we are modifying the string and not updating the length of the string after modification
                // Not a palindrome
                System.out.println("Not a palindrome");
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
    }
}

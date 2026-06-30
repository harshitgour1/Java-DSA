public class Prob_1967 {

    // Approach:
    // 1. Iterate through the patterns array
    // 2. For each pattern, check if it is a substring of the word using the contains() method
    // 3. If it is a substring, increment the count
    // 4. Return the count after checking all patterns

    public static int numOfStrings(String[] patterns, String word){
        int count = 0;
        for(String pattern : patterns){
            if(word.contains(pattern)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "ab";
        System.out.println(numOfStrings(patterns, word)); 
    }
}

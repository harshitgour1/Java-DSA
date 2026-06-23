
public class ValidAnagram {

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        // HashMap<Character, Integer> map = new HashMap<>();

        // for(char ch: s.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0) + 1); // Increment the count of the character in the map
        //     // If the character is not present in the map, it will be added with a count of 1. If it is already present, its count will be incremented by 1.
        // }

        // for(char ch: t.toCharArray()){
        //     if(!map.containsKey(ch)){
        //         return false;
        //     }

        //     map.put(ch, map.get(ch) -1); // Decrement the count of the character in the map. If the character is not present in the map, it will return false. If it is present, its count will be decremented by 1.
        //     // If the count of the character becomes negative, it means there are more occurrences of that character in t than in s, so it's not an anagram.

        //     if(map.get(ch) < 0){
        //         return false;
        //     }
            
        // }
        // return true;


        // ----------------------------------------------------------------------

        int[] count = new int[26]; // Assuming only lowercase letters

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++; // Increment the count of the character in the count array. The index is determined by subtracting 'a' from the character, which gives a value between 0 and 25 for lowercase letters.
            
            count[t.charAt(i) - 'a']--; // Decrement the count of the character in the count array. The index is determined by subtracting 'a' from the character, which gives a value between 0 and 25 for lowercase letters.
        
            System.out.println(count[s.charAt(i) - 'a'] + " " + count[t.charAt(i) - 'a']);
        }
        
        for(int i = 0; i < 26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}

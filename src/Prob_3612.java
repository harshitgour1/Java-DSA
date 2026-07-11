public class Prob_3612 {

    // Approach:
    // 1. Initialize a StringBuilder to build the result string.
    // 2. Iterate through each character in the input string s.
    // 3. For each character, check if it is a special character ('*', '#', or '%').
    // 4. If the character is '*', remove the last character from the result if the result is not empty.
    // 5. If the character is '#', duplicate the current result and append it to itself. 
    // 6. If the character is '%', reverse the current result.
    // 7. If the character is not a special character, append it to the result.
    // 8. After processing all characters, return the final result as a string.

    public static String processStr(String s){

        if(s.length() == 0 || s == null){
            return "";
        }

        char[] ch = s.toCharArray();
        StringBuilder result = new StringBuilder();


        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '*'){
                // remove the last character from the result
                if(result.length() > 0){
                    result.deleteCharAt(result.length() - 1);
                }

            } else if(ch[i] == '#'){
                // A '#' duplicates the current result and appends it to itself.
                result.append(result.toString());
            } else if(ch[i] == '%'){
                // reverse the current result
                result.reverse();
            } else{
                result.append(ch[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "a#b%*";
        System.out.println(processStr(s));
    }
}

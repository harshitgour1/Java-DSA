
import java.util.Arrays;

public class Prob_14 {
    
    public static String longestCommonPrefix(String[] strs){

        if(strs == null || strs.length == 0){
            return "";
        }        
        int length = strs.length;
        
        if(length == 1){
            return strs[0];
        }

        Arrays.sort(strs);

        int end = Math.min(strs[0].length(), strs[length - 1].length());

        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[length - 1].charAt(i)) { 
            i++;
        }

        String prefix = strs[0].substring(0, i);

        return prefix;
        
    }
    
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}

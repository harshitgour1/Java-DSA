public class Prob_796 {

    public static boolean rotateString(String s, String goal){

        if(s.length() != goal.length()){
            return false;
        }

        // if(s.equalsIgnoreCase(goal)){
        //     return true;
        // }

        // for(int i = 0; i < s.length(); i++){

            
        //     String rotated = s.substring(i) + s.substring(0, i);
        //     System.out.println(rotated);
        //     if(rotated.equalsIgnoreCase(goal)){
        //         return true;
        //     }
        // }

        // return false;

        return (s + s).contains(goal);
    }
    public static void main(String[] args) {
        String s = "abcde", 
                goal = "abced"; // true
        
        System.out.println(rotateString(s, goal)); 
    }
}

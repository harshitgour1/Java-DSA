public class Prob_3612 {

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

public class Prob_1189 {

    public static int maxNumberOfBalloons(String text){
        // max no. of balloons instances in a string.
        // return the max no.

        if(text.length() < 7){
            return 0;
        }

        int b = 0, a = 0, l = 0, o = 0, n =0;
        int count = 0;
        int maxCount = 0;

        
        char[] ch = text.toCharArray();

        for(int i = 0; i < ch.length; i++){
            switch (ch[i]) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
                default -> {
                }
            }
        }

        // if(b == 1 && a == 1 && l == 2 && o == 2 && n == 1){
        //     count++;
        //     maxCount = count;

        //     // b = 0; a = 0; l = 0; o = 0; n = 0;
        // }



        while(b >= 1 && a >= 1 && l >= 2 && o >= 2 && n >= 1){
            b--;
            a--;
            l -= 2;
            o -= 2;
            n--;

            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        String text = "loonbalxballpoon";

        System.out.println(maxNumberOfBalloons(text));
    }
}

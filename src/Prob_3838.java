public class Prob_3838 {

    public static String mapWordWeights(String[] words, int[] weights) {

        // Take words[i] then check each char of it. 
        // then match that char index with the index of weights
        // sum the weights of each char and return the sum of weights then module of sum % 26. 
        // then the value after modulo match it with an reverse char's array that 0 -> z, 1 -> y, ..., 25 -> 'a'
        // concatenate all strings char's and return 

        // hint : For each word, sum character weights using weights[c - 'a']

        // String result = "";
        StringBuilder result = new StringBuilder();
        


        for(int i = 0; i < words.length; i++){
            char[] c = words[i].toCharArray();
            int sum = 0;
            for(int j = 0; j < c.length; j++){
                sum += weights[c[j] - 'a'];
            }

            int charValue = sum % 26; 

            char mappedChar = (char) ('z' - charValue);
            // result += mappedChar; 
            result.append(mappedChar);
        }
        // return result;
        return result.toString();
    }


    public static void main(String[] args) {
        String[] words = {"abcd","def","xyz"};
        int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};


        System.out.println(mapWordWeights(words, weights));
    }
}

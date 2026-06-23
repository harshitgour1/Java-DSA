class Prob_3751 {

    public static int totalWaviness(int num1, int num2){
        int count = 0;

        // String num1str = String.valueOf(num1);
        // int num1len = num1str.length();
        // String num2str = String.valueOf(num2);
        // int num2len = num2str.length();

        // if(num1len < 3){
        //     return 0;
        // }
        


        for(int i = num1; i <= num2; i++){ 
            String numStr = String.valueOf(i);
            int len = numStr.length(); // 4 indexes: 0, 1, 2, 3

            if(len < 3){
                continue;
            }

            for(int j = 1; j < len - 1; j++){
                int prev = numStr.charAt(j - 1) - '0';
                int curr = numStr.charAt(j) - '0';
                int next = numStr.charAt(j + 1) - '0';

                if((curr > prev && curr > next) || (curr < prev && curr < next)){
                    count++;
                }
            
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int num1 = 4848, num2 = 4848;  

        System.out.println(totalWaviness(num1, num2));
    }
}
public class MinFlip {
    
    public static int flips(String s){
        int count = 0;
        // System.out.println(s.length());
        for(int i = 0; i < s.length() - 1; i++){
            System.out.print(s.charAt(i) + " ");

            if (s.charAt(i) == '1' && s.charAt(i+1) == '1'){
                s = s.substring(0, i) + '0' + s.substring(i + 1);
                count++;
            }
        }
        
        

        return count;
    }
    public static void main(String[] args) {
        String s = "1010";
        System.out.print(flips(s));
    }
}

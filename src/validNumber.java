public class validNumber {

    public static boolean validNum(int n, int x){
        boolean result;
        String s = String.valueOf(n);
        String num = String.valueOf(x);
        if(s.contains(num) && s.charAt(0) != num.charAt(0)){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 101, x = 0;
        System.out.println(validNum(n, x));
    }
}

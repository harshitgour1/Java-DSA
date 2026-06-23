public class Prob_744 {

    public static char nextGreatestLetter(char[] letters, char target){
        // char ans = Character.MAX_VALUE;

        // for(char c: letters){
        //     if(c > target && c < min){
        //         min = c;
        //     }
        // }

        // for(char c: letters){
        //     if(c > target && c == min && c != target){

        //         return c;
                
        //     }
        // }

        // more optimal way to do it:
        // for(char c: letters){
        //     if(c > target){
        //         ans = c;
        //         break;
        //     }
        // }

        // return ans == Character.MAX_VALUE ? letters[0] : ans;

        // the reason we return letters[0] if ans is still Character.MAX_VALUE is because of the circular nature of the problem. If we don't find any character greater than target, it means we have to wrap around and return the smallest character in the array, which is letters[0] since the array is sorted.


        // using binary search:
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2; // to avoid overflow 

            if(letters[mid] > target){
                end = mid - 1;
            } else if(letters[mid] <= target){
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';

        System.out.println(nextGreatestLetter(letters, target));

    }
}

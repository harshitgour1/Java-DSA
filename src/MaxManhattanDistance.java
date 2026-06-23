public class MaxManhattanDistance {

    public static int maxDistance(String moves){
        int distance = 0;

        char[] move = moves.toCharArray();
        // for(int i = 0; i < move.length; i++){
        //     if(move[i] == 'L' || move[i] == 'R'){
        //         distance++;
        //     }
        //     else if(move[i] == 'U' || move[i] == 'D' || move[i] == '_'){
        //         distance++;
        //     }
            
        // }

        // The maximum Manhattan distance is the sum of the absolute values of the x and y coordinates.
        // for DU giving 2 but actual is 0
        // _ can vary it can be U D L R 


        // proper code

        int x = 0;
        int y = 0;

        for(int i = 0; i < move.length; i++){
            if(move[i] == 'L'){
                x--;
            }
            else if(move[i] == 'R'){
                x++;
            }
            else if(move[i] == 'U'){
                y++;
            }
            else if(move[i] == 'D'){
                y--;
            }
        }

        distance = Math.abs(x) + Math.abs(y);
        



        return distance;
    }
    public static void main(String[] args) {
        String moves = "DU";
        System.out.println(maxDistance(moves));
    }
}

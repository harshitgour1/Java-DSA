import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

    // Approach: BFS + Binary Search
    // 1. Use BFS to calculate the distance of each cell from the nearest thief (cell with value 1). Store these distances in a 2D array.
    // 2. Use binary search to find the maximum safeness factor. The safeness factor is defined as the minimum distance from any cell to the nearest thief. We will search for the maximum safeness factor that allows a path from the top-left corner to the bottom-right corner of the grid.
    // 3. For each mid value in the binary search, use BFS to check if there exists a path from the top-left corner to the bottom-right corner of the grid such that all cells in the path have a distance greater than or equal to mid. If such a path exists, we can try for a higher safeness factor; otherwise, we need to lower our expectations.  
    // Time Complexity: O(n^2 log n), where n is the size of the grid. The BFS takes O(n^2) time, and we perform binary search over the possible safeness factors, which can be at most 2n.

public class Prob_2812 {

    private static final int[][] DIRS = {
        {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();

        int[][] dist = new int[n][n];
        for(int[] row: dist){
            Arrays.fill(row, -1);
        }   

        Queue<int[]> q = new LinkedList<>();

        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                if(grid.get(r).get(c) == 1){
                    dist[r][c] = 0;
                    q.offer(new int[]{r, c});
                }
            }
        }

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            for(int[] d : DIRS){
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr < 0 || nr >= n || nc < 0 || nc >= n){
                    continue;
                }

                if(dist[nr][nc] != -1){
                    continue;
                }

                dist[nr][nc] = dist[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }

        int low = 0;
        int high = 2 * n;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(canReach(dist, mid)){
                ans = mid;
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean canReach(int[][] dist, int safe){
        int n = dist.length;

        if(dist[0][0] < safe || dist[n - 1][n - 1] < safe){
            return false;
        }

        boolean[][] visited = new boolean[n][n];
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{0, 0});
        visited[0][0] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];

            if(r == n - 1 && c == n - 1){
                return true;
            }

            for(int[] d : DIRS){
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr < 0 || nr >= n || nc < 0 || nc >= n){
                    continue;
                }

                if(visited[nr][nc] || dist[nr][nc] < safe){
                    continue;
                }

                visited[nr][nc] = true;
                q.offer(new int[]{nr, nc});
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 1},
            {0, 0, 0},
            {0, 0, 0}
        };

        List<List<Integer>> gridList = new LinkedList<>();
        for (int[] row : grid) {
            List<Integer> rowList = new LinkedList<>();
            for (int val : row) {
                rowList.add(val);
            }
            gridList.add(rowList);
        }

        Prob_2812 solution = new Prob_2812();
        int result = solution.maximumSafenessFactor(gridList);
        System.out.println(result);
    }
}

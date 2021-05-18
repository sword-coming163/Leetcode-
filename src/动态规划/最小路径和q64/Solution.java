package 动态规划.最小路径和q64;

import java.util.Arrays;

public class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 1; i < n; i++) {
            grid[0][i] = grid[0][i-1]+grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            grid[i][0] = grid[i-1][0]+grid[i][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
            }
        }
//        System.out.println(Arrays.deepToString(dp));
        return grid[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,3,1},{1,5,1}, {4,2,1}};
        System.out.println(Arrays.deepToString(grid));
        System.out.println(new Solution().minPathSum(grid));
    }
}

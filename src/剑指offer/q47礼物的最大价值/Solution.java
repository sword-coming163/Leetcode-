package 剑指offer.q47礼物的最大价值;

public class Solution {
    public int maxValue(int[][] grid) {
        if (grid==null){
            return -1;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        //状态转移方程为 dp[i][j] = Math(dp[i-1][j],dp[i][j-1])+grid[i][j]
        //初始化边界条件
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0]+grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j-1]+grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] grip = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(new Solution().maxValue(grip));
    }
}

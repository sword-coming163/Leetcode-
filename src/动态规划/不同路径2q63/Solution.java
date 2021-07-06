package 动态规划.不同路径2q63;

import java.util.Arrays;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid==null){
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        //初始化dp数组
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0]==1){
                for (int j = i; j < m; j++) {
                    dp[j][0] = 0;
                }
                break;
            }else {
                dp[i][0] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i]==1){
                for (int j = i; j < n; j++) {
                    dp[0][j] = 0;
                }
                break;
            }else {
                dp[0][i] = 1;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j]==1){
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }

            }

        }
//        System.out.println(Arrays.deepToString(dp));
        return dp[m-1][n-1];
    }
    public int uniquePathsWithObstacles1(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[] f = new int[n];

        f[0] = obstacleGrid[0][0] == 0 ? 1 : 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (obstacleGrid[i][j] == 1) {
                    f[j] = 0;
                    continue;
                }
                if (j - 1 >= 0 && obstacleGrid[i][j - 1] == 0) {
                    f[j] += f[j - 1];
                }
            }
            System.out.println(Arrays.toString(f));
        }

        return f[n - 1];
    }
    public static void main(String[] args) {
        int[][] obstacleGrid = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(new Solution().uniquePathsWithObstacles1(obstacleGrid));
    }
}

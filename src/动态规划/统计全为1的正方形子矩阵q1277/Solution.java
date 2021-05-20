package 动态规划.统计全为1的正方形子矩阵q1277;

public class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        // dp[i][j] 代表以 (i, j) 为右下角的正方形个数
        int[][] dp = new int[m][n];
        // 统计所有的正方形个数，作为返回值
        int ans = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                // 如果 matrix[i][j] == 0，那么不需要考虑，它不可能成为一个正方形的右下角，所以直接置0
                if (matrix[i][j] == 0) dp[i][j] = 0;
                    // 如果碰到了左边或者上边边界，而且里面的值还是 1，那么以 (i, j) 为右下角的正方形个数只能为 1
                else if (i == 0 || j == 0) dp[i][j] = 1;
                    // 否则的话，就根据状态方程，更新个数
                else dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                // 记得统计数据
                ans += dp[i][j];
            }
        }
        return ans;
    }

}

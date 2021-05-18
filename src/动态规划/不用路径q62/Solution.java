package 动态规划.不用路径q62;

public class Solution {
    //使用动态规划解决 return dp[i-1][j-1]
    //初始条件 dp[0][j]=1;dp[i][0]=1;
    //状态转移方程 dp[i][j] = dp[i-1][j]+dp[i][j-1]
    public int uniquePaths(int m, int n) {
        int[][] dp =new int[m][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().uniquePaths(3,7));
    }
}

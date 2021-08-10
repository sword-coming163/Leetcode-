package 笔试.shoope.q2;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/2:19:24
 */
public class Solution {
    public int divide(int n, int k) {
        // write code here
        int[][] dp = new int[n+1][k+1];
        dp[0][0] = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=k; j++) {
                if (i>=j){
                    dp[i][j] = dp[i-j][j]+dp[i-1][j-1];
                }
            }
        }
        return dp[n][k];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().divide(7,3));
    }
}

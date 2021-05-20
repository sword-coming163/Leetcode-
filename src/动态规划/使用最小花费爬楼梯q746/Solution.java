package 动态规划.使用最小花费爬楼梯q746;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i <cost.length; i++) {
            dp[i] = Math.min(dp[i-1]+cost[i],dp[i-2]+cost[i]);
        }
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }

    public static void main(String[] args) {
        int[] cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        System.out.println(new Solution().minCostClimbingStairs(cost));
    }
}

package 动态规划.q518零钱兑换2;

import java.util.Arrays;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/19:20:40
 */
public class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] = dp[j] + dp[j-coins[i]];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5};
        System.out.println(new Solution().change(5,nums));
    }
}

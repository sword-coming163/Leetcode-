package 动态规划.q322零钱兑换;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/19:20:04
 */
public class Solution {
    /**
      * @param coins
     * @param amount
      * @description: 贪心
      * @return {@link int}
      * @throws
      * @author zhang
      * @date 2021/7/19 20:04
     */
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE-1);
        System.out.println(Arrays.toString(dp));
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        System.out.println(Arrays.toString(dp));

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,5};
        System.out.println(new Solution().coinChange(nums,11));
    }
}

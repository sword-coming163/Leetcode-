package 动态规划.q122买卖股票的最佳时机2;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/20:11:25
 */
public class Solution {
    /**
      * @param prices
      * @description: 使用动态规划
      * @return {@link int}
      * @throws
      * @author zhang
      * @date 2021/7/20 11:27
     */
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }

        // cash：持有现金
        // hold：持有股票
        // 状态转移：cash → hold → cash → hold → cash → hold → cash

        int cash = 0;
        int hold = -prices[0];

        int preCash = cash;
        int preHold = hold;
        for (int i = 1; i < len; i++) {
            cash = Math.max(preCash, preHold + prices[i]);
            hold = Math.max(preHold, preCash - prices[i]);

            preCash = cash;
            preHold = hold;
        }
        return cash;
    }
    /**
      * @param prices
      * @description: 贪心
      * @return {@link int}
      * @throws
      * @author zhang
      * @date 2021/7/20 13:49
     */
    public int maxProfit1(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }

        int res = 0;
        for (int i = 1; i < len; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                res += diff;
            }
        }
        return res;
    }
}

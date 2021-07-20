package 动态规划.q121买股票的最佳时机;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/20:10:48
 */
public class Solution {
    /**
      * @param prices
      * @description: 首先使用暴力算法
      * @return {@link int}
      * @throws
      * @author zhang
      * @date 2021/7/20 10:51
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                max = Math.max(max,prices[j]-prices[i]);
            }
        }
        return max;
    }
    /**
      * @param prices
      * @description: 寻找最优最小值
      * @return {@link int}
      * @throws
      * @author zhang
      * @date 2021/7/20 11:04
     */
    public int maxProfit1(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<min){
                min = prices[i];
            }else {
                max = Math.max(max,prices[i]-min);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{7,1,5,3,6,4};
        System.out.println(new Solution().maxProfit(nums));
    }
}

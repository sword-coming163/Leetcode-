package 剑指offer.q63股票的最大利润;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length==0){
            return 0;
        }
        //使用双指针解决问题
        int min = prices[0];
        int max = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>max){
                max = prices[i];
            }if (prices[i]<min){
                min = prices[i];
                max = min;
            }
            res = Math.max(res,max-min);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(new Solution().maxProfit(prices));
    }
}

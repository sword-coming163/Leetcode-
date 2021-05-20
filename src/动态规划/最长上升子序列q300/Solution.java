package 动态规划.最长上升子序列q300;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{10,9,2,5,3,7,101,18};
        int[] nums1 = new int[]{0,1,0,3,2,3};
        System.out.println(new Solution().lengthOfLIS(nums1));
    }
}

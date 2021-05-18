package 动态规划.最大子序和q53;

public class Solution {
    //暴力破解
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i],max);
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0){
                continue;
            }
            sum = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                sum = nums[j]+sum;
                max = Math.max(sum,max);
            }
        }
        return max;

    }
    //使用动态规划解决
    //状态转移方程dp[i][j] = dp[i][j-1]+nums[j];nums[j]>0;
    public int maxSubArray1(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Solution().maxSubArray1(nums));
    }
}

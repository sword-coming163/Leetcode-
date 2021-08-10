package 企业常见题目.q53最大子序和;

import java.util.Arrays;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/1:10:30
 */
public class Solution {
    /**
      * @param nums
      * @description: 使用动态规划记录最大值
      * @return {@link int}
      * @throws
      * @author zhang
      * @date 2021/8/1 10:31
     */
    public int maxSubArray(int[] nums) {
        if (nums==null||nums.length==0){
            return 0;
        }
        int res = nums[0];
        int old = nums[0];
        int newVal = old;
        for (int i = 1; i < nums.length; i++) {
            newVal = Math.max(nums[i],old+nums[i]);
            res = Math.max(res,newVal);
            old = newVal;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,4,-1,7,8};
        System.out.println(new Solution().maxSubArray(nums));
    }
}

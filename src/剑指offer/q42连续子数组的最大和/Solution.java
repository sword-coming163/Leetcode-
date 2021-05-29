package 剑指offer.q42连续子数组的最大和;

import java.util.Arrays;

public class Solution {
    //动态规划问题+循环数组
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        int max = nums[0];
        int pre = nums[0];
        int curr = nums[0];
        for (int i = 1; i < length; i++) {

            if (pre>0){
                curr =pre+nums[i];
            }else {
                curr = nums[i];
            }

            max = Math.max(max,curr);
            pre = curr;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Solution().maxSubArray(nums));
    }
}

package 双指针遍历.接雨水q42.training;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/18:14:43
 */
public class Solution {
    /**
      * @param height
      * @description: 一共接多少雨水
      * @return {@link int}
      * @throws
      * @author zhang
      * @date 2021/7/18 14:47
     */
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        int left_max = 0, right_max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    ans += (left_max - height[left]);
                }
                ++left;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    ans += (right_max - height[right]);
                }
                --right;
            }
        }
        return ans;
    }
}

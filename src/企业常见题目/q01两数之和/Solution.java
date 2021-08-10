package 企业常见题目.q01两数之和;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhang
 * @title: Solution
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/1:10:19
 */
public class Solution {
    /**
      * @param nums
 * @param target
      * @description: 通过hashmap元素降低时间复杂度为O(n),空间复杂度为O(n)
      * @return {@link int[]}
      * @throws
      * @author zhang
      * @date 2021/8/1 10:19
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums==null||nums.length==0){
            return new int[0];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        System.out.println(Arrays.toString(new Solution().twoSum(nums,6)));
    }
}

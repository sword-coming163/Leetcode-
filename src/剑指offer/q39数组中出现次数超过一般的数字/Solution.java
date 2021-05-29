package 剑指offer.q39数组中出现次数超过一般的数字;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
            if (hashMap.getOrDefault(nums[i],0)>=nums.length/2+1){
                return nums[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(new Solution().majorityElement(nums));
    }
    public int majorityElement1(int[] nums) {
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        return x;
    }
}

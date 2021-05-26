package 剑指offer.q3数组中重复的数字;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i) {
                i++;
                continue;
            }
            if(nums[nums[i]] == nums[i]) return nums[i];
            int tmp = nums[i];
            nums[i] = nums[tmp];
            nums[tmp] = tmp;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 4, 2, 5, 3};
        System.out.println(new Solution().findRepeatNumber(nums));
    }
}

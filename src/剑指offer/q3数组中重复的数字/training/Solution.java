package 剑指offer.q3数组中重复的数字.training;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        //第一种解法，可以使用HashSet进行添加元素，当添加元素失败的时候就输出重复的数组
        //时间复杂度O（n）,空间复杂度O(N)
        Set<Integer> hashset = new HashSet<>();
        for(int i =0; i<nums.length;i++){
            if(!hashset.add(nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
    public int findRepeatNumber1(int[] nums) {
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
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(new Solution().findRepeatNumber1(nums));
    }
}

package 双指针遍历.删除有序数组中的重复项q26;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int j =1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]){
                continue;
            }

            nums[j] = nums[i];
            j++;

        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        System.out.println(new Solution().removeDuplicates(nums));
    }
}

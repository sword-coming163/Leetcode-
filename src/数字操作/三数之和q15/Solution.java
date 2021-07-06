package 数字操作.三数之和q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //使用排序+双指针+剪枝
        List<List<Integer>> res = new ArrayList<>();
        if (nums==null||nums.length<3){
            return res;
        }
        Arrays.sort(nums);
        int length = nums.length;
        int left = 1;
        int right = length-1;
        for (int i = 0; i < length-2; i++) {
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            if (nums[i]+nums[length-1]+nums[length-2]<0){
                continue;
            }
            if (nums[i]+nums[i+1]+nums[i+2]>0){
                break;
            }
            left = i+1;
            right = length-1;
            while (left<right){
                while (left<right&&left>i+1&&nums[left]==nums[left-1]){
                    left++;
                }
                while (left<right&&right<length-1&&nums[right]==nums[right+1]){
                    right--;
                }
                if (left>=right){
                    break;
                }
                int ans = nums[i]+nums[left]+nums[right];
                if (ans>0){
                    right--;
                }
                else if (ans<0){
                    left++;
                }
                else if (ans==0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,0};
        System.out.println(new Solution().threeSum(nums));
    }
}

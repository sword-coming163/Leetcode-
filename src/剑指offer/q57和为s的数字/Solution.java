package 剑指offer.q57和为s的数字;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        //判断边界条件
        if (nums.length==0){
            return new int[2];
        }
        //有序数组搜索使用二分查找
        int left = 0;
        int right = nums.length-1;
        int index = 0;
        int mid;
        while (index<nums.length-2){
            while (left<=right){
                mid = left+(right-left)/2;
                if (nums[mid]==target-nums[index]){
                    return new int[]{nums[index],nums[mid]};
                }
                else if (nums[mid]>target-nums[index]){
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
            index++;
            left = index;
            right = nums.length-1;
        }
        return new int[2];
    }
    //使用双指针解决
    public int[] twoSum1(int[] nums,int target){
        if (nums.length==0){
            return new int[2];
        }
        int left = 0;
        int right = nums.length;
        while (left<right){
            if (nums[left]+nums[right]==target){
                return new int[]{nums[left],nums[right]};
            }else if (nums[left]+nums[right]>target){
                right--;
            }else {
                left++;
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(new Solution().twoSum(nums,9)));
    }
}

package 分治.在排序数组中查找元素的第一个和最后一个位置q34;

import java.util.Arrays;

public class Solution {
    public int[] searchRange1(int[] nums, int target) {

        int[] ans = new int[]{-1,-1};
        if (nums.length==1&&nums[0]==target){
            ans[0] = ans[1] =0;
            return ans;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                ans[0] = i;
                for (int j = i; j < nums.length; j++) {
                    if(nums[j]==nums[i]){
                        ans[1] = j;
                        if (j == nums.length-1){
                            return ans;
                        }

                        continue;

                    }

                    return ans;
                }
            }
        }
        return ans;
    }
    //二分查找
    public int[] searchRange(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2};
        System.out.println(Arrays.toString(new Solution().searchRange(nums,2)));
    }
}

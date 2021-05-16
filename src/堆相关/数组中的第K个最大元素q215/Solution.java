package 堆相关.数组中的第K个最大元素q215;

import java.util.Arrays;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));;
        return nums[nums.length-k];
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,6,4};
        System.out.println(new Solution().findKthLargest(nums,2));
    }
}

package 剑指offer.q21调整数组顺序使奇数位于偶数前面;

import java.util.Arrays;

public class Solution {
    public int[] exchange(int[] nums) {
        //使用额外的空间存储
        if (nums==null){
            return null;
        }
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==1){
                res[left] = nums[i];
                left++;
            }else {
                res[right] = nums[i];
                right--;
            }
        }
        return res;
    }
    //使用本地数组进行存储 双指针
    public int[] exchange1(int[] nums){
        int right = nums.length-1;
        for (int left = 0; left <= right; left++) {
            if (nums[left]%2==0){
                while (nums[right]%2==0){
                    right--;
                    if (left==right){
                        return nums;
                    }
                    if (right==0){
                        return nums;
                    }
                }
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{8,10,3,20,12,4,10,8,4,0,5,17,7,20,3};
        System.out.println(Arrays.toString(new Solution().exchange1(ints)));
    }
}

package 剑指offer.q53缺失的数字;

public class Solution {
    public int missingNumber(int[] nums) {
        if (nums==null||nums.length==0){
            return -1;
        }
        int length = nums.length;
        int sum = (length+1)*length/2;
        int sum1=0;
        for (int i = 0; i < nums.length; i++) {
            sum1 = sum1 + nums[i];
        }
        return sum-sum1;
    }
    //二分查找
    public int missingNumber1(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) i = m + 1;
            else j = m;
        }
        return i;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4,5,6,7,9};
        System.out.println(new Solution().missingNumber(nums));
    }
}

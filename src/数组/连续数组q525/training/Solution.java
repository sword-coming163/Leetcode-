package 数组.连续数组q525.training;

public class Solution {
    public int findMaxLength(int[] nums) {
        //前缀和
        int length = 0;
        int count = 0;
        //双指针
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                count = count-1;
            }else {
                count = count+1;
            }
            if (count==0){
                length = Math.max(length,i+1);
            }
        }

        return length;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,1,0,1,1};
        System.out.println(new Solution().findMaxLength(nums));
    }
}

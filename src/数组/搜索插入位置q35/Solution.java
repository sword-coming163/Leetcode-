package 数组.搜索插入位置q35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        //有序数组的寻找与插入选择二分查找，查找到则返回索引，找不到则插入，时间复杂度O(logN)，空间复杂度O(1)
//        根据if的判断条件，left左边的值一直保持小于target，right右边的值一直保持大于等于target，而且left最终一定等于right+1，
//        这么一来，循环结束后，在left和right之间画一条竖线，恰好可以把数组分为两部分：left左边的部分和right右边的部分，
//        而且left左边的部分全部小于target，并以right结尾；right右边的部分全部大于等于target，
//        并以left为首。所以最终答案一定在left的位置。
        if (nums==null){
            return -1;
        }
        int length = nums.length;
        int left = 0;
        int right = length-1;
        int mid = 0;
        while (left<=right){
            mid = left+(right-left)/2;
            if (nums[mid]>target){
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else {
                return mid;
            }
        }
        System.out.println(left);
        System.out.println(right);
         return left;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,5,6};
        System.out.println(new Solution().searchInsert(nums,4));
    }
}

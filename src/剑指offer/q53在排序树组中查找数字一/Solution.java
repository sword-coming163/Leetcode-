package 剑指offer.q53在排序树组中查找数字一;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums==null||nums.length==0){
            return 0;
        }
//        if (nums.length==1){
//            if (target==nums[0]){
//                return 1;
//            }else {
//                return 1;
//            }
//
//        }
        //使用二分查找
        int left =  binarySearch(nums,target,true);
        int right = binarySearch(nums,target,false)-1;
        if (left>=0&&right<nums.length&&left<nums.length&&right>=0&&(nums[left]==nums[right])){
            return right-left+1;
        }else {
            return 0;
        }

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
        System.out.println(new Solution().search(nums,3));
    }
}

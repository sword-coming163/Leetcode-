package 数组.寻找两个正序数组中的中位数q4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if((nums1==null||nums1.length==0)&&(nums2!=null&&nums2.length!=0)){
            if (nums2.length%2==0){
            //偶数
                return (nums2[nums2.length/2-1]+nums2[nums2.length/2])/2.0;
            }else {
                return nums2[nums2.length/2];
            }
        }
        if((nums2==null||nums2.length==0)&&(nums1!=null&&nums1.length!=0)){
            if (nums1.length%2==0){
                //偶数
                return (nums1[nums1.length/2-1]+nums1[nums1.length/2])/2.0;
            }else {
                return nums1[nums1.length/2];
            }
        }
        int[] nums = new int[nums1.length+nums2.length];
        int first = 0;
        int second = 0;
        int i = 0;
        while (first!=nums1.length&&second!=nums2.length){
            if (nums1[first]<=nums2[second]){
                nums[i] = nums1[first];
                first++;
            }else {
                nums[i] = nums2[second];
                second++;
            }
            i++;
        }
//        System.out.println(Arrays.toString(nums));

        if (first==nums1.length){
            //数组1先为空
            for (int j = second; j < nums2.length; j++) {
                nums[i] = nums2[j];
                i++;
            }
        }else {
            //数组2先为空
            for (int j = first; j < nums1.length; j++) {
                nums[i] = nums1[j];
                i++;
            }
        }
//        System.out.println(Arrays.toString(nums));
        if (nums.length%2==0){
            //偶数
            return (nums[nums.length/2-1]+nums[nums.length/2])/2.0;
        }else {
            return nums[nums.length/2];
        }
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{};
        int[] num2 = new int[]{0,1,2,3};
        System.out.println(new Solution().findMedianSortedArrays(num1,num2));
    }
}

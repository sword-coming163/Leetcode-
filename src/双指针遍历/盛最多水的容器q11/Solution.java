package 双指针遍历.盛最多水的容器q11;

public class Solution {
    //暴力破解+超时
    public int maxArea1(int[] height) {
        int max = 0;
        int capacity = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                capacity = (Math.min(height[j],height[i]))*(j-i);
                max = Math.max(max,capacity);
            }
        }
        return max;

    }
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int capacity = 0;
        int max = 0;
        while (left<right){
            capacity = (Math.min(height[left],height[right]))*(right-left);
            max = Math.max(max,capacity);
            if(height[left]<=height[right]){
                left++;
            }else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution().maxArea(height));
    }
}

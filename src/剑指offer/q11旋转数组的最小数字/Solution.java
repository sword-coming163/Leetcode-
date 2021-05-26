package 剑指offer.q11旋转数组的最小数字;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //使用二分查找寻找
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot-1;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
    //暴力解法
    public int minArray1(int[] numbers){
        if (numbers.length==0){
            return -1;
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            min = Math.min(min,numbers[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums  = new int[]{4,5,6,1,2,3};
        List<Integer> list = new ArrayList<>();
        System.out.println(new Solution().minArray(nums));
    }
}

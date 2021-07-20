package 排序.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * @author zhang
 * @title: quickSort
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/7/20:15:23
 */
public class QuickSort {
    public void quicksort(int[] nums){
        quicksort(0,nums.length-1,nums);
    }

    private void quicksort(int left, int right, int[] nums) {

        if (left>right){
            return;
        }
        int i = partition(left,right,nums);
        quicksort(left,i-1,nums);
        quicksort(i+1,right,nums);
    }

    private int partition(int left, int right, int[] nums) {
        int index = left;
        int pivot =nums[index];
        for (int i = left+1; i <=right; i++) {
            if (nums[i]<pivot){
                index++;
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
        nums[left] = nums[index];
        nums[index] = pivot;
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[10000];
        System.out.println(Math.random());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random()*10000);
        }
        System.out.println(Arrays.toString(nums));
        Date start = new Date();
        QuickSort quickSort = new QuickSort();
        quickSort.quicksort(nums);
        Date end = new Date();
        System.out.println(Arrays.toString(nums));
        System.out.println(end.getTime()-start.getTime());
    }
}
